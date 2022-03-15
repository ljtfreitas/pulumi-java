// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImportCollectorPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImportCollectorPropertiesArgs Empty = new ImportCollectorPropertiesArgs();

    @Import(name="discoverySiteId")
      private final @Nullable Output<String> discoverySiteId;

    public Output<String> getDiscoverySiteId() {
        return this.discoverySiteId == null ? Output.empty() : this.discoverySiteId;
    }

    public ImportCollectorPropertiesArgs(@Nullable Output<String> discoverySiteId) {
        this.discoverySiteId = discoverySiteId;
    }

    private ImportCollectorPropertiesArgs() {
        this.discoverySiteId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImportCollectorPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> discoverySiteId;

        public Builder() {
    	      // Empty
        }

        public Builder(ImportCollectorPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.discoverySiteId = defaults.discoverySiteId;
        }

        public Builder discoverySiteId(@Nullable Output<String> discoverySiteId) {
            this.discoverySiteId = discoverySiteId;
            return this;
        }

        public Builder discoverySiteId(@Nullable String discoverySiteId) {
            this.discoverySiteId = Output.ofNullable(discoverySiteId);
            return this;
        }
        public ImportCollectorPropertiesArgs build() {
            return new ImportCollectorPropertiesArgs(discoverySiteId);
        }
    }
}
