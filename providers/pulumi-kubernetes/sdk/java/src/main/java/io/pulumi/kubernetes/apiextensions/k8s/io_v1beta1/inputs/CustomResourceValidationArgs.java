// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.JSONSchemaPropsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CustomResourceValidation is a list of validation methods for CustomResources.
 * 
 */
public final class CustomResourceValidationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceValidationArgs Empty = new CustomResourceValidationArgs();

    /**
     * openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
     * 
     */
    @InputImport(name="openAPIV3Schema")
        private final @Nullable Input<JSONSchemaPropsArgs> openAPIV3Schema;

    public Input<JSONSchemaPropsArgs> getOpenAPIV3Schema() {
        return this.openAPIV3Schema == null ? Input.empty() : this.openAPIV3Schema;
    }

    public CustomResourceValidationArgs(@Nullable Input<JSONSchemaPropsArgs> openAPIV3Schema) {
        this.openAPIV3Schema = openAPIV3Schema;
    }

    private CustomResourceValidationArgs() {
        this.openAPIV3Schema = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JSONSchemaPropsArgs> openAPIV3Schema;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceValidationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.openAPIV3Schema = defaults.openAPIV3Schema;
        }

        public Builder setOpenAPIV3Schema(@Nullable Input<JSONSchemaPropsArgs> openAPIV3Schema) {
            this.openAPIV3Schema = openAPIV3Schema;
            return this;
        }

        public Builder setOpenAPIV3Schema(@Nullable JSONSchemaPropsArgs openAPIV3Schema) {
            this.openAPIV3Schema = Input.ofNullable(openAPIV3Schema);
            return this;
        }
        public CustomResourceValidationArgs build() {
            return new CustomResourceValidationArgs(openAPIV3Schema);
        }
    }
}
