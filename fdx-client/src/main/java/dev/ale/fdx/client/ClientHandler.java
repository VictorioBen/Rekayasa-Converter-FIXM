package dev.ale.fdx.client;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.SocketChannel;
import io.netty.util.CharsetUtil;

public  class ClientHandler extends SimpleChannelInboundHandler {
	
	
	
    public void channelActive(ChannelHandlerContext channelHandlerContext, Object msg){
        channelHandlerContext.writeAndFlush(Unpooled.copiedBuffer("Netty Rocks!", CharsetUtil.UTF_8));
        ByteBuf inBuffer = (ByteBuf) msg;
        String received = inBuffer.toString(CharsetUtil.UTF_8);
        System.out.println("Client received: " + received);

        channelHandlerContext.write(Unpooled.copiedBuffer("Hello " + received, CharsetUtil.UTF_8));

        
    }
    
   

    @Override
    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable cause){
        cause.printStackTrace();
        channelHandlerContext.close();
    }
    
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf in) throws Exception {
		 System.out.println("Client received: " + in.toString(CharsetUtil.UTF_8));
		
	}



	@Override
	protected void channelRead0(ChannelHandlerContext arg0, Object arg1) throws Exception {
		// TODO Auto-generated method stub
		
	}
//	public void sendFile(File file) throws IOException {
//	DataOutputStream dos = new DataOutputStream();
//	//	InputStream inStream = socket1.getInputStream();
//	//	BufferedInputStream input = new BufferedInputStream(inStream);
//	//	DataInputStream din = new DataInputStream(socket.getInputStream());
//		FileInputStream fis = new FileInputStream(file);
//		//BufferedInputStream in = new BufferedInputStream(socket.getInputStream());
//        
//		//int code = fis.read();
//		byte[] buffer = new byte[(int)file.length()];
//		dos.writeUTF(file.getName());
//		
//		while((fis.read(buffer)) >= 0) 
//		{
//			dos.write(buffer);
//			System.out.println("File terkirim  : " +file.getName());
//		}
//		int code = input.read(buffer);
//		if(code == 1) {
//			System.out.println("File Berhasil di convert");
//		}
//		fis.close();
//		dos.close();
//	}

}
