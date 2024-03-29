package uk.ac.belfastmet.dewarfs.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.dewarfs.controller.DewarfController;
import uk.ac.belfastmet.dewarfs.domain.Dewarf;
import uk.ac.belfastmet.dewarfs.repository.DewarfRepository;

/**
 * class to assign dewarfs to arrays 
 * @author ric19171870
 *
 */

@Service
public class DewarfService {

	Logger log = LoggerFactory.getLogger(DewarfController.class);
	private ArrayList<Dewarf> tolkinDewarfs;

	@Autowired
	public DewarfRepository dwarfRepo;

	// old method from pre databse connection retained for learning
//	/**
//	 * class to create disney dewarfs and assign them to the disney dewarf arraylist
//	 * 
//	 * @return
//	 */
//	public ArrayList<Dewarf> getDisneyDewarfs() {
//		this.disneyDewarfs = new ArrayList<Dewarf>();
//
//		this.disneyDewarfs.add(new Dewarf("Sleepy", "Disney", "Sleepy.png"));
//		this.disneyDewarfs.add(new Dewarf("Dopey", "Disney", "Dopey.png"));
//		this.disneyDewarfs.add(new Dewarf("Happy", "Disney", "Happy.png"));
//		this.disneyDewarfs.add(new Dewarf("Bashful", "Disney", "Bashful.png"));
//		this.disneyDewarfs.add(new Dewarf("Grumpy", "Disney", "Grumpy.png"));
//		this.disneyDewarfs.add(new Dewarf("Doc", "Disney", "Doc.png"));
//		this.disneyDewarfs.add(new Dewarf("Sneezy", "Disney", "Sneezy.png"));
//		return this.disneyDewarfs;
//
//	}

	/**
	 * method to assign dwarfs from database to array
	 * @return dewarfs iterable array 
	 */
	public Iterable<Dewarf> getDisneyDewarfs() {
		log.info("entering get disney dwarf method");
		Iterable<Dewarf> dwarfs = dwarfRepo.findAll();
		Iterator<Dewarf> iterator = dwarfs.iterator();

		while (iterator.hasNext()) {
			log.info(iterator.next().toString());
		}

		return dwarfs;
	}

	/**
	 * class to create tolkin dewarfs and assign them to the tolkin dewarf arraylist
	 * 
	 * @return array of tolkin dwarfs
	 */
	public ArrayList<Dewarf> getTolkinDewarfs() {
		this.tolkinDewarfs = new ArrayList<Dewarf>();

		this.tolkinDewarfs.add(new Dewarf("Thorin", "Tolkin", "Thorin.png"));
		this.tolkinDewarfs.add(new Dewarf("Balin", "Tolkin", "Balin.png"));
		this.tolkinDewarfs.add(new Dewarf("Dwalin", "Tolkin", "Dwalin.png"));
		this.tolkinDewarfs.add(new Dewarf("Fili", "Tolkin", "Fili.png"));
		this.tolkinDewarfs.add(new Dewarf("Kili", "Tolkin", "Kili.png"));
		this.tolkinDewarfs.add(new Dewarf("Dori", "Tolkin", "Dori.png"));
		this.tolkinDewarfs.add(new Dewarf("Nori", "Tolkin", "Nori.png"));
		this.tolkinDewarfs.add(new Dewarf("Oin", "Tolkin", "Oin.png"));
		this.tolkinDewarfs.add(new Dewarf("Orin", "Tolkin", "Ori.png"));
		this.tolkinDewarfs.add(new Dewarf("Gloin", "Tolkin", "Gloin.png"));
		this.tolkinDewarfs.add(new Dewarf("Bifur", "Tolkin", "Bifur.png"));
		this.tolkinDewarfs.add(new Dewarf("Bofur", "Tolkin", "Bofur.png"));
		this.tolkinDewarfs.add(new Dewarf("Bombur", "Tolkin", "Bombur.png"));

		return this.tolkinDewarfs;
	}
}
