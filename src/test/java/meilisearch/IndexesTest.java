/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package meilisearch;

import org.junit.Before;
import org.junit.Test;


public class IndexesTest {

	Client ms;

	@Before
	public void initialize() {
		ms = new Client(new Config("http://localhost:7700", ""));
	}

	@Test
	public void createIndex() throws Exception {
		System.out.println(ms.createIndex("videos"));
	}

	@Test
	public void getIndexes() throws Exception {
		MeiliSearchIndex[] meilisearchIndices = ms.getIndexList();
		for (int a = 0; a < meilisearchIndices.length; a++) {
			System.out.println(meilisearchIndices[a]);
		}

	}

	@Test
	public void getIndex() throws Exception {
		// TODO: input uid for test
		MeiliSearchIndex meilisearchIndex = ms.getIndex("movies");
		System.out.println(meilisearchIndex);
	}

	@Test
	public void put() throws Exception {

	}

	@Test
	public void update() throws Exception {
		System.out.println(ms.updateIndex("video", "videos_key"));

	}

	@Test
	public void delete() throws Exception {
		System.out.println(ms.deleteIndex("videos"));
	}
}
