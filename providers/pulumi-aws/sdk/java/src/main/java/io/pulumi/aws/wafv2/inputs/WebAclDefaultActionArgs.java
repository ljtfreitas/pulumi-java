// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowArgs;
import io.pulumi.aws.wafv2.inputs.WebAclDefaultActionBlockArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclDefaultActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclDefaultActionArgs Empty = new WebAclDefaultActionArgs();

    /**
     * Specifies that AWS WAF should allow requests by default. See Allow below for details.
     * 
     */
    @InputImport(name="allow")
    private final @Nullable Input<WebAclDefaultActionAllowArgs> allow;

    public Input<WebAclDefaultActionAllowArgs> getAllow() {
        return this.allow == null ? Input.empty() : this.allow;
    }

    /**
     * Specifies that AWS WAF should block requests by default. See Block below for details.
     * 
     */
    @InputImport(name="block")
    private final @Nullable Input<WebAclDefaultActionBlockArgs> block;

    public Input<WebAclDefaultActionBlockArgs> getBlock() {
        return this.block == null ? Input.empty() : this.block;
    }

    public WebAclDefaultActionArgs(
        @Nullable Input<WebAclDefaultActionAllowArgs> allow,
        @Nullable Input<WebAclDefaultActionBlockArgs> block) {
        this.allow = allow;
        this.block = block;
    }

    private WebAclDefaultActionArgs() {
        this.allow = Input.empty();
        this.block = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclDefaultActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclDefaultActionAllowArgs> allow;
        private @Nullable Input<WebAclDefaultActionBlockArgs> block;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclDefaultActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
        }

        public Builder setAllow(@Nullable Input<WebAclDefaultActionAllowArgs> allow) {
            this.allow = allow;
            return this;
        }

        public Builder setAllow(@Nullable WebAclDefaultActionAllowArgs allow) {
            this.allow = Input.ofNullable(allow);
            return this;
        }

        public Builder setBlock(@Nullable Input<WebAclDefaultActionBlockArgs> block) {
            this.block = block;
            return this;
        }

        public Builder setBlock(@Nullable WebAclDefaultActionBlockArgs block) {
            this.block = Input.ofNullable(block);
            return this;
        }
        public WebAclDefaultActionArgs build() {
            return new WebAclDefaultActionArgs(allow, block);
        }
    }
}