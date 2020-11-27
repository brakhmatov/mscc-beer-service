package guru.springframework.msscbeerservice.web.model;

import java.util.List;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class BeerPagedList extends PageImpl<BeerDto> {
	private static final long serialVersionUID = 8424121041133979195L;
	
	public BeerPagedList(List<BeerDto> content) {
		super(content);
	}

	public BeerPagedList(List<BeerDto> content, Pageable pageable, long total) {
		super(content, pageable, total);
	}
}
