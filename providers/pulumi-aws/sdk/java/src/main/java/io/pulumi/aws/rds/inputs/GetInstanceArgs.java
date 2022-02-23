// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceArgs Empty = new GetInstanceArgs();

    /**
     * The name of the RDS instance
     * 
     */
    @InputImport(name="dbInstanceIdentifier", required=true)
    private final String dbInstanceIdentifier;

    public String getDbInstanceIdentifier() {
        return this.dbInstanceIdentifier;
    }

    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetInstanceArgs(
        String dbInstanceIdentifier,
        @Nullable Map<String,String> tags) {
        this.dbInstanceIdentifier = Objects.requireNonNull(dbInstanceIdentifier, "expected parameter 'dbInstanceIdentifier' to be non-null");
        this.tags = tags;
    }

    private GetInstanceArgs() {
        this.dbInstanceIdentifier = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dbInstanceIdentifier;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbInstanceIdentifier = defaults.dbInstanceIdentifier;
    	      this.tags = defaults.tags;
        }

        public Builder setDbInstanceIdentifier(String dbInstanceIdentifier) {
            this.dbInstanceIdentifier = Objects.requireNonNull(dbInstanceIdentifier);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetInstanceArgs build() {
            return new GetInstanceArgs(dbInstanceIdentifier, tags);
        }
    }
}
