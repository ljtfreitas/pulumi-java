// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PolicyAdmissionWhitelistPatternArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyAdmissionWhitelistPatternArgs Empty = new PolicyAdmissionWhitelistPatternArgs();

    /**
     * An image name pattern to whitelist, in the form
     * `registry/path/to/image`. This supports a trailing * as a
     * wildcard, but this is allowed only in text after the registry/
     * part.
     * 
     */
    @Import(name="namePattern", required=true)
      private final Output<String> namePattern;

    public Output<String> getNamePattern() {
        return this.namePattern;
    }

    public PolicyAdmissionWhitelistPatternArgs(Output<String> namePattern) {
        this.namePattern = Objects.requireNonNull(namePattern, "expected parameter 'namePattern' to be non-null");
    }

    private PolicyAdmissionWhitelistPatternArgs() {
        this.namePattern = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAdmissionWhitelistPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> namePattern;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAdmissionWhitelistPatternArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namePattern = defaults.namePattern;
        }

        public Builder namePattern(Output<String> namePattern) {
            this.namePattern = Objects.requireNonNull(namePattern);
            return this;
        }

        public Builder namePattern(String namePattern) {
            this.namePattern = Output.of(Objects.requireNonNull(namePattern));
            return this;
        }
        public PolicyAdmissionWhitelistPatternArgs build() {
            return new PolicyAdmissionWhitelistPatternArgs(namePattern);
        }
    }
}
