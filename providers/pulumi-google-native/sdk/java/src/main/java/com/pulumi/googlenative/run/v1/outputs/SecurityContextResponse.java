// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class SecurityContextResponse {
    /**
     * @return (Optional) The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    private final Integer runAsUser;

    @CustomType.Constructor
    private SecurityContextResponse(@CustomType.Parameter("runAsUser") Integer runAsUser) {
        this.runAsUser = runAsUser;
    }

    /**
     * @return (Optional) The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    public Integer runAsUser() {
        return this.runAsUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer runAsUser;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.runAsUser = defaults.runAsUser;
        }

        public Builder runAsUser(Integer runAsUser) {
            this.runAsUser = Objects.requireNonNull(runAsUser);
            return this;
        }        public SecurityContextResponse build() {
            return new SecurityContextResponse(runAsUser);
        }
    }
}
