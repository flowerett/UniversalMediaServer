package net.pms.util;

import java.util.ArrayList;
import net.pms.PMS;
import net.pms.dlna.DLNAResource;

public class DLNAList extends ArrayList<DLNAResource> {
	private static final long serialVersionUID = -5775968769790761576L;

	@Override
	public DLNAResource remove(int index) {
		PMS.getGlobalRepo().setValid(get(index), false);
		return super.remove(index);
	}

	public boolean remove(DLNAResource r) {
		PMS.getGlobalRepo().setValid(r, false);
		return super.remove(r);
	}

	@Override
	public void clear() {
		for (DLNAResource my : this) {
			PMS.getGlobalRepo().setValid(my, false);
		}
		super.clear();
	}
}
