// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.WebACLAllowAction;
import io.pulumi.awsnative.wafv2.outputs.WebACLBlockAction;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebACLDefaultAction {
    private final @Nullable WebACLAllowAction allow;
    private final @Nullable WebACLBlockAction block;

    @CustomType.Constructor
    private WebACLDefaultAction(
        @CustomType.Parameter("allow") @Nullable WebACLAllowAction allow,
        @CustomType.Parameter("block") @Nullable WebACLBlockAction block) {
        this.allow = allow;
        this.block = block;
    }

    public Optional<WebACLAllowAction> getAllow() {
        return Optional.ofNullable(this.allow);
    }
    public Optional<WebACLBlockAction> getBlock() {
        return Optional.ofNullable(this.block);
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

        public Builder allow(@Nullable WebACLAllowAction allow) {
            this.allow = allow;
            return this;
        }

        public Builder block(@Nullable WebACLBlockAction block) {
            this.block = block;
            return this;
        }
        public WebACLDefaultAction build() {
            return new WebACLDefaultAction(allow, block);
        }
    }
}
