// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PolicyAdmissionWhitelistPattern {
    /**
     * An image name pattern to whitelist, in the form
     * `registry/path/to/image`. This supports a trailing * as a
     * wildcard, but this is allowed only in text after the registry/
     * part.
     * 
     */
    private final String namePattern;

    @CustomType.Constructor
    private PolicyAdmissionWhitelistPattern(@CustomType.Parameter("namePattern") String namePattern) {
        this.namePattern = namePattern;
    }

    /**
     * An image name pattern to whitelist, in the form
     * `registry/path/to/image`. This supports a trailing * as a
     * wildcard, but this is allowed only in text after the registry/
     * part.
     * 
    */
    public String namePattern() {
        return this.namePattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAdmissionWhitelistPattern defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namePattern;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAdmissionWhitelistPattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namePattern = defaults.namePattern;
        }

        public Builder namePattern(String namePattern) {
            this.namePattern = Objects.requireNonNull(namePattern);
            return this;
        }        public PolicyAdmissionWhitelistPattern build() {
            return new PolicyAdmissionWhitelistPattern(namePattern);
        }
    }
}
