package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by jt on 9/25/17.
 */
@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);//it will generate instance of CategoryMapper


    CategoryDTO categoryToCategoryDTO(Category category);
}
