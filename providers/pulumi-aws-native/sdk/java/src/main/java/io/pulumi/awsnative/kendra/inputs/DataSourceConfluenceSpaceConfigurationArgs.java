// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceConfluenceSpaceToIndexFieldMappingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceConfluenceSpaceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceConfluenceSpaceConfigurationArgs Empty = new DataSourceConfluenceSpaceConfigurationArgs();

    @Import(name="crawlArchivedSpaces")
      private final @Nullable Output<Boolean> crawlArchivedSpaces;

    public Output<Boolean> getCrawlArchivedSpaces() {
        return this.crawlArchivedSpaces == null ? Output.empty() : this.crawlArchivedSpaces;
    }

    @Import(name="crawlPersonalSpaces")
      private final @Nullable Output<Boolean> crawlPersonalSpaces;

    public Output<Boolean> getCrawlPersonalSpaces() {
        return this.crawlPersonalSpaces == null ? Output.empty() : this.crawlPersonalSpaces;
    }

    @Import(name="excludeSpaces")
      private final @Nullable Output<List<String>> excludeSpaces;

    public Output<List<String>> getExcludeSpaces() {
        return this.excludeSpaces == null ? Output.empty() : this.excludeSpaces;
    }

    @Import(name="includeSpaces")
      private final @Nullable Output<List<String>> includeSpaces;

    public Output<List<String>> getIncludeSpaces() {
        return this.includeSpaces == null ? Output.empty() : this.includeSpaces;
    }

    @Import(name="spaceFieldMappings")
      private final @Nullable Output<List<DataSourceConfluenceSpaceToIndexFieldMappingArgs>> spaceFieldMappings;

    public Output<List<DataSourceConfluenceSpaceToIndexFieldMappingArgs>> getSpaceFieldMappings() {
        return this.spaceFieldMappings == null ? Output.empty() : this.spaceFieldMappings;
    }

    public DataSourceConfluenceSpaceConfigurationArgs(
        @Nullable Output<Boolean> crawlArchivedSpaces,
        @Nullable Output<Boolean> crawlPersonalSpaces,
        @Nullable Output<List<String>> excludeSpaces,
        @Nullable Output<List<String>> includeSpaces,
        @Nullable Output<List<DataSourceConfluenceSpaceToIndexFieldMappingArgs>> spaceFieldMappings) {
        this.crawlArchivedSpaces = crawlArchivedSpaces;
        this.crawlPersonalSpaces = crawlPersonalSpaces;
        this.excludeSpaces = excludeSpaces;
        this.includeSpaces = includeSpaces;
        this.spaceFieldMappings = spaceFieldMappings;
    }

    private DataSourceConfluenceSpaceConfigurationArgs() {
        this.crawlArchivedSpaces = Output.empty();
        this.crawlPersonalSpaces = Output.empty();
        this.excludeSpaces = Output.empty();
        this.includeSpaces = Output.empty();
        this.spaceFieldMappings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfluenceSpaceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> crawlArchivedSpaces;
        private @Nullable Output<Boolean> crawlPersonalSpaces;
        private @Nullable Output<List<String>> excludeSpaces;
        private @Nullable Output<List<String>> includeSpaces;
        private @Nullable Output<List<DataSourceConfluenceSpaceToIndexFieldMappingArgs>> spaceFieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfluenceSpaceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crawlArchivedSpaces = defaults.crawlArchivedSpaces;
    	      this.crawlPersonalSpaces = defaults.crawlPersonalSpaces;
    	      this.excludeSpaces = defaults.excludeSpaces;
    	      this.includeSpaces = defaults.includeSpaces;
    	      this.spaceFieldMappings = defaults.spaceFieldMappings;
        }

        public Builder crawlArchivedSpaces(@Nullable Output<Boolean> crawlArchivedSpaces) {
            this.crawlArchivedSpaces = crawlArchivedSpaces;
            return this;
        }

        public Builder crawlArchivedSpaces(@Nullable Boolean crawlArchivedSpaces) {
            this.crawlArchivedSpaces = Output.ofNullable(crawlArchivedSpaces);
            return this;
        }

        public Builder crawlPersonalSpaces(@Nullable Output<Boolean> crawlPersonalSpaces) {
            this.crawlPersonalSpaces = crawlPersonalSpaces;
            return this;
        }

        public Builder crawlPersonalSpaces(@Nullable Boolean crawlPersonalSpaces) {
            this.crawlPersonalSpaces = Output.ofNullable(crawlPersonalSpaces);
            return this;
        }

        public Builder excludeSpaces(@Nullable Output<List<String>> excludeSpaces) {
            this.excludeSpaces = excludeSpaces;
            return this;
        }

        public Builder excludeSpaces(@Nullable List<String> excludeSpaces) {
            this.excludeSpaces = Output.ofNullable(excludeSpaces);
            return this;
        }

        public Builder includeSpaces(@Nullable Output<List<String>> includeSpaces) {
            this.includeSpaces = includeSpaces;
            return this;
        }

        public Builder includeSpaces(@Nullable List<String> includeSpaces) {
            this.includeSpaces = Output.ofNullable(includeSpaces);
            return this;
        }

        public Builder spaceFieldMappings(@Nullable Output<List<DataSourceConfluenceSpaceToIndexFieldMappingArgs>> spaceFieldMappings) {
            this.spaceFieldMappings = spaceFieldMappings;
            return this;
        }

        public Builder spaceFieldMappings(@Nullable List<DataSourceConfluenceSpaceToIndexFieldMappingArgs> spaceFieldMappings) {
            this.spaceFieldMappings = Output.ofNullable(spaceFieldMappings);
            return this;
        }
        public DataSourceConfluenceSpaceConfigurationArgs build() {
            return new DataSourceConfluenceSpaceConfigurationArgs(crawlArchivedSpaces, crawlPersonalSpaces, excludeSpaces, includeSpaces, spaceFieldMappings);
        }
    }
}
