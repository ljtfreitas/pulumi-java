// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs Empty = new CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs();

    /**
     * Required. The parts of an OID path. The most significant parts of the path come first.
     * 
     */
    @InputImport(name="objectIdPaths", required=true)
        private final Input<List<Integer>> objectIdPaths;

    public Input<List<Integer>> getObjectIdPaths() {
        return this.objectIdPaths;
    }

    public CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs(Input<List<Integer>> objectIdPaths) {
        this.objectIdPaths = Objects.requireNonNull(objectIdPaths, "expected parameter 'objectIdPaths' to be non-null");
    }

    private CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs() {
        this.objectIdPaths = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<Integer>> objectIdPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdPaths = defaults.objectIdPaths;
        }

        public Builder setObjectIdPaths(Input<List<Integer>> objectIdPaths) {
            this.objectIdPaths = Objects.requireNonNull(objectIdPaths);
            return this;
        }

        public Builder setObjectIdPaths(List<Integer> objectIdPaths) {
            this.objectIdPaths = Input.of(Objects.requireNonNull(objectIdPaths));
            return this;
        }
        public CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs build() {
            return new CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs(objectIdPaths);
        }
    }
}
