// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLImmunityTimePropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebACLCaptchaConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLCaptchaConfigArgs Empty = new WebACLCaptchaConfigArgs();

    @InputImport(name="immunityTimeProperty")
        private final @Nullable Input<WebACLImmunityTimePropertyArgs> immunityTimeProperty;

    public Input<WebACLImmunityTimePropertyArgs> getImmunityTimeProperty() {
        return this.immunityTimeProperty == null ? Input.empty() : this.immunityTimeProperty;
    }

    public WebACLCaptchaConfigArgs(@Nullable Input<WebACLImmunityTimePropertyArgs> immunityTimeProperty) {
        this.immunityTimeProperty = immunityTimeProperty;
    }

    private WebACLCaptchaConfigArgs() {
        this.immunityTimeProperty = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLCaptchaConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebACLImmunityTimePropertyArgs> immunityTimeProperty;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLCaptchaConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.immunityTimeProperty = defaults.immunityTimeProperty;
        }

        public Builder setImmunityTimeProperty(@Nullable Input<WebACLImmunityTimePropertyArgs> immunityTimeProperty) {
            this.immunityTimeProperty = immunityTimeProperty;
            return this;
        }

        public Builder setImmunityTimeProperty(@Nullable WebACLImmunityTimePropertyArgs immunityTimeProperty) {
            this.immunityTimeProperty = Input.ofNullable(immunityTimeProperty);
            return this;
        }
        public WebACLCaptchaConfigArgs build() {
            return new WebACLCaptchaConfigArgs(immunityTimeProperty);
        }
    }
}
