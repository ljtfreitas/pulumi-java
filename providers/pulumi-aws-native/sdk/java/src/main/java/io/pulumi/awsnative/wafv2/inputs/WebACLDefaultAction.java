// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLAllowAction;
import io.pulumi.awsnative.wafv2.inputs.WebACLBlockAction;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Default Action WebACL will take against ingress traffic when there is no matching Rule.
 * 
 */
public final class WebACLDefaultAction extends io.pulumi.resources.InvokeArgs {

    public static final WebACLDefaultAction Empty = new WebACLDefaultAction();

    @InputImport(name="allow")
        private final @Nullable WebACLAllowAction allow;

    public Optional<WebACLAllowAction> getAllow() {
        return this.allow == null ? Optional.empty() : Optional.ofNullable(this.allow);
    }

    @InputImport(name="block")
        private final @Nullable WebACLBlockAction block;

    public Optional<WebACLBlockAction> getBlock() {
        return this.block == null ? Optional.empty() : Optional.ofNullable(this.block);
    }

    public WebACLDefaultAction(
        @Nullable WebACLAllowAction allow,
        @Nullable WebACLBlockAction block) {
        this.allow = allow;
        this.block = block;
    }

    private WebACLDefaultAction() {
        this.allow = null;
        this.block = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLDefaultAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebACLAllowAction allow;
        private @Nullable WebACLBlockAction block;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLDefaultAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
        }

        public Builder setAllow(@Nullable WebACLAllowAction allow) {
            this.allow = allow;
            return this;
        }

        public Builder setBlock(@Nullable WebACLBlockAction block) {
            this.block = block;
            return this;
        }
        public WebACLDefaultAction build() {
            return new WebACLDefaultAction(allow, block);
        }
    }
}
