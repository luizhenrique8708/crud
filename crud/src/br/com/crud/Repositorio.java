package br.com.crud;
import org.hibernate.Query;

public class Repositorio {
	private Transaction tx = null; 
	private Session session = null; 
	private Query select = null; 
	private SessionFactory hibernate = new Configuration().configure().buildSessionFactory();
	private Produto produto = null;

	public void cadastroSistema(Object obj){
		session = hibernate.openSession();
		tx = session.beginTransaction();
		
		if(obj instanceof Produto){
			produto = (Produto) obj;
			session.save (produto);
			
		}
		tx.commit();
		session.flush();
		session.close();
	}
	
	public void alteraSistema(Object obj){
		session = hibernate.openSession();
		tx = session.beginTransaction();
		
		if(obj instanceof Produto){
			produto = (Produto) obj;
			session.update (produto);
			
		}
		tx.commit();
		session.flush();
		session.close();
		
	} catch (Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
	public void cadastroSistema(Object obj){
		session = hibernate.openSession();
		tx = session.beginTransaction();
		
		if(obj instanceof Produto){
			produto = (Produto) obj;
			session.delete (produto);
			
		}
		tx.commit();
		session.flush();
		session.close();
	} catch (Exception e){
		System.out.println(e.getMessage());
	}
}
