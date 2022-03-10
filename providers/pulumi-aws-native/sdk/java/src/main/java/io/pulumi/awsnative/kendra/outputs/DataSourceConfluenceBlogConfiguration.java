// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.outputs.DataSourceConfluenceBlogToIndexFieldMapping;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceConfluenceBlogConfiguration {
    private final @Nullable List<DataSourceConfluenceBlogToIndexFieldMapping> blogFieldMappings;

    @OutputCustomType.Constructor
    private DataSourceConfluenceBlogConfiguration(@OutputCustomType.Parameter("blogFieldMappings") @Nullable List<DataSourceConfluenceBlogToIndexFieldMapping> blogFieldMappings) {
        this.blogFieldMappings = blogFieldMappings;
    }

    public List<DataSourceConfluenceBlogToIndexFieldMapping> getBlogFieldMappings() {
        return this.blogFieldMappings == null ? List.of() : this.blogFieldMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfluenceBlogConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataSourceConfluenceBlogToIndexFieldMapping> blogFieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfluenceBlogConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blogFieldMappings = defaults.blogFieldMappings;
        }

        public Builder setBlogFieldMappings(@Nullable List<DataSourceConfluenceBlogToIndexFieldMapping> blogFieldMappings) {
            this.blogFieldMappings = blogFieldMappings;
            return this;
        }
        public DataSourceConfluenceBlogConfiguration build() {
            return new DataSourceConfluenceBlogConfiguration(blogFieldMappings);
        }
    }
}
