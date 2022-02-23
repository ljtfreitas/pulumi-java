// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.Action;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IP rule with specific IP or IP range in CIDR format.
 * 
 */
public final class IPRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPRuleArgs Empty = new IPRuleArgs();

    /**
     * The action of IP ACL rule.
     * 
     */
    @InputImport(name="action")
        private final @Nullable Input<Either<String,Action>> action;

    public Input<Either<String,Action>> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     * 
     */
    @InputImport(name="iPAddressOrRange", required=true)
        private final Input<String> iPAddressOrRange;

    public Input<String> getIPAddressOrRange() {
        return this.iPAddressOrRange;
    }

    public IPRuleArgs(
        @Nullable Input<Either<String,Action>> action,
        Input<String> iPAddressOrRange) {
        this.action = action == null ? Input.ofLeft("Allow") : action;
        this.iPAddressOrRange = Objects.requireNonNull(iPAddressOrRange, "expected parameter 'iPAddressOrRange' to be non-null");
    }

    private IPRuleArgs() {
        this.action = Input.empty();
        this.iPAddressOrRange = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,Action>> action;
        private Input<String> iPAddressOrRange;

        public Builder() {
    	      // Empty
        }

        public Builder(IPRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.iPAddressOrRange = defaults.iPAddressOrRange;
        }

        public Builder setAction(@Nullable Input<Either<String,Action>> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable Either<String,Action> action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setIPAddressOrRange(Input<String> iPAddressOrRange) {
            this.iPAddressOrRange = Objects.requireNonNull(iPAddressOrRange);
            return this;
        }

        public Builder setIPAddressOrRange(String iPAddressOrRange) {
            this.iPAddressOrRange = Input.of(Objects.requireNonNull(iPAddressOrRange));
            return this;
        }
        public IPRuleArgs build() {
            return new IPRuleArgs(action, iPAddressOrRange);
        }
    }
}
