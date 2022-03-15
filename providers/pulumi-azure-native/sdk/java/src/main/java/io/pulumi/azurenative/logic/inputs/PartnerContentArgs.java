// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.B2BPartnerContentArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The integration account partner content.
 * 
 */
public final class PartnerContentArgs extends io.pulumi.resources.ResourceArgs {

    public static final PartnerContentArgs Empty = new PartnerContentArgs();

    /**
     * The B2B partner content.
     * 
     */
    @Import(name="b2b")
      private final @Nullable Output<B2BPartnerContentArgs> b2b;

    public Output<B2BPartnerContentArgs> getB2b() {
        return this.b2b == null ? Output.empty() : this.b2b;
    }

    public PartnerContentArgs(@Nullable Output<B2BPartnerContentArgs> b2b) {
        this.b2b = b2b;
    }

    private PartnerContentArgs() {
        this.b2b = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartnerContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<B2BPartnerContentArgs> b2b;

        public Builder() {
    	      // Empty
        }

        public Builder(PartnerContentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.b2b = defaults.b2b;
        }

        public Builder b2b(@Nullable Output<B2BPartnerContentArgs> b2b) {
            this.b2b = b2b;
            return this;
        }

        public Builder b2b(@Nullable B2BPartnerContentArgs b2b) {
            this.b2b = Output.ofNullable(b2b);
            return this;
        }
        public PartnerContentArgs build() {
            return new PartnerContentArgs(b2b);
        }
    }
}
