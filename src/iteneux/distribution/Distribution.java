package iteneux.distribution;

import java.util.ArrayList;
import java.util.List;

import iteneux.enums.DistributionType;

public class Distribution {
	
	private List<DistributionType> types = new ArrayList<DistributionType>(8);
	
	public List<DistributionType> getTypes() {
		return types;
	}

	public void setTypes(List<DistributionType> types) {
		this.types = types;
	}
	
	public void add(DistributionType type) {
		types.add(type);
	}
	
	
	
	/*private DistributionType champion;
	private DistributionType nonChampion2;
	private DistributionType nonChampion3;
	private DistributionType nonChampion4;
	private DistributionType nonChampion5;
	private DistributionType nonChampion6;
	private DistributionType cupWinner;
	private DistributionType fairPlay;
	
	public Distribution(DistributionType champion, DistributionType nonChampion2, DistributionType nonChampion3, DistributionType nonChampion4,
			DistributionType nonChampion5, DistributionType nonChampion6, DistributionType cupWinner, DistributionType fairPlay) {
		super();
		this.champion = champion;
		this.nonChampion2 = nonChampion2;
		this.nonChampion3 = nonChampion3;
		this.nonChampion4 = nonChampion4;
		this.nonChampion5 = nonChampion5;
		this.nonChampion6 = nonChampion6;
		this.cupWinner = cupWinner;
		this.fairPlay = fairPlay;
	}

	public DistributionType getChampion() {
		return champion;
	}

	public void setChampion(DistributionType champion) {
		this.champion = champion;
	}

	public DistributionType getNonChampion2() {
		return nonChampion2;
	}

	public void setNonChampion2(DistributionType nonChampion2) {
		this.nonChampion2 = nonChampion2;
	}

	public DistributionType getNonChampion3() {
		return nonChampion3;
	}

	public void setNonChampion3(DistributionType nonChampion3) {
		this.nonChampion3 = nonChampion3;
	}

	public DistributionType getNonChampion4() {
		return nonChampion4;
	}

	public void setNonChampion4(DistributionType nonChampion4) {
		this.nonChampion4 = nonChampion4;
	}

	public DistributionType getNonChampion5() {
		return nonChampion5;
	}

	public void setNonChampion5(DistributionType nonChampion5) {
		this.nonChampion5 = nonChampion5;
	}

	public DistributionType getNonChampion6() {
		return nonChampion6;
	}

	public void setNonChampion6(DistributionType nonChampion6) {
		this.nonChampion6 = nonChampion6;
	}

	public DistributionType getCupWinner() {
		return cupWinner;
	}

	public void setCupWinner(DistributionType cupWinner) {
		this.cupWinner = cupWinner;
	}

	public DistributionType getFairPlay() {
		return fairPlay;
	}

	public void setFairPlay(DistributionType fairPlay) {
		this.fairPlay = fairPlay;
	}*/

}
