// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PermissionsDataLocationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PermissionsDataLocationGetArgs Empty = new PermissionsDataLocationGetArgs();

    /**
     * Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     * 
     */
    @InputImport(name="arn", required=true)
    private final Input<String> arn;

    public Input<String> getArn() {
        return this.arn;
    }

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @InputImport(name="catalogId")
    private final @Nullable Input<String> catalogId;

    public Input<String> getCatalogId() {
        return this.catalogId == null ? Input.empty() : this.catalogId;
    }

    public PermissionsDataLocationGetArgs(
        Input<String> arn,
        @Nullable Input<String> catalogId) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.catalogId = catalogId;
    }

    private PermissionsDataLocationGetArgs() {
        this.arn = Input.empty();
        this.catalogId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionsDataLocationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> arn;
        private @Nullable Input<String> catalogId;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionsDataLocationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.catalogId = defaults.catalogId;
        }

        public Builder setArn(Input<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Input.of(Objects.requireNonNull(arn));
            return this;
        }

        public Builder setCatalogId(@Nullable Input<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder setCatalogId(@Nullable String catalogId) {
            this.catalogId = Input.ofNullable(catalogId);
            return this;
        }
        public PermissionsDataLocationGetArgs build() {
            return new PermissionsDataLocationGetArgs(arn, catalogId);
        }
    }
}
