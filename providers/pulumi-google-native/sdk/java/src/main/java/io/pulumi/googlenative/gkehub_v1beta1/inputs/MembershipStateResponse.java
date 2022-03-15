// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * State of the Membership resource.
 * 
 */
public final class MembershipStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final MembershipStateResponse Empty = new MembershipStateResponse();

    /**
     * The current state of the Membership resource.
     * 
     */
    @Import(name="code", required=true)
      private final String code;

    public String getCode() {
        return this.code;
    }

    /**
     * This field is never set by the Hub Service.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * This field is never set by the Hub Service.
     * 
     */
    @Import(name="updateTime", required=true)
      private final String updateTime;

    public String getUpdateTime() {
        return this.updateTime;
    }

    public MembershipStateResponse(
        String code,
        String description,
        String updateTime) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
    }

    private MembershipStateResponse() {
        this.code = null;
        this.description = null;
        this.updateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String description;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.description = defaults.description;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public MembershipStateResponse build() {
            return new MembershipStateResponse(code, description, updateTime);
        }
    }
}
