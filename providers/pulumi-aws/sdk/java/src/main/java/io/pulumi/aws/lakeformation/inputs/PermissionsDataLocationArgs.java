// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PermissionsDataLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PermissionsDataLocationArgs Empty = new PermissionsDataLocationArgs();

    /**
     * Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     * 
     */
    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @Import(name="catalogId")
      private final @Nullable Output<String> catalogId;

    public Output<String> getCatalogId() {
        return this.catalogId == null ? Output.empty() : this.catalogId;
    }

    public PermissionsDataLocationArgs(
        Output<String> arn,
        @Nullable Output<String> catalogId) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.catalogId = catalogId;
    }

    private PermissionsDataLocationArgs() {
        this.arn = Output.empty();
        this.catalogId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionsDataLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private @Nullable Output<String> catalogId;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionsDataLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.catalogId = defaults.catalogId;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }

        public Builder catalogId(@Nullable Output<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = Output.ofNullable(catalogId);
            return this;
        }
        public PermissionsDataLocationArgs build() {
            return new PermissionsDataLocationArgs(arn, catalogId);
        }
    }
}
