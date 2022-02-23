// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * AllowedCSIDriver represents a single inline CSI Driver that is allowed to be used.
 * 
 */
public final class AllowedCSIDriverArgs extends io.pulumi.resources.ResourceArgs {

    public static final AllowedCSIDriverArgs Empty = new AllowedCSIDriverArgs();

    /**
     * Name is the registered name of the CSI driver
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public AllowedCSIDriverArgs(Input<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private AllowedCSIDriverArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedCSIDriverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedCSIDriverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public AllowedCSIDriverArgs build() {
            return new AllowedCSIDriverArgs(name);
        }
    }
}
