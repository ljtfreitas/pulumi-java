// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A package managed by APT. - install: `apt-get update && apt-get -y install [name]` - remove: `apt-get -y remove [name]`
 * 
 */
public final class OSPolicyResourcePackageResourceAPTResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourcePackageResourceAPTResponse Empty = new OSPolicyResourcePackageResourceAPTResponse();

    /**
     * Package name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public OSPolicyResourcePackageResourceAPTResponse(String name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private OSPolicyResourcePackageResourceAPTResponse() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceAPTResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceAPTResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public OSPolicyResourcePackageResourceAPTResponse build() {
            return new OSPolicyResourcePackageResourceAPTResponse(name);
        }
    }
}
