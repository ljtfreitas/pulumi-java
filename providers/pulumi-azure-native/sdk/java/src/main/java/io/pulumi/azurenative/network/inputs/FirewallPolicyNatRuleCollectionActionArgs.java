// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.FirewallPolicyNatRuleCollectionActionType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the FirewallPolicyNatRuleCollectionAction.
 * 
 */
public final class FirewallPolicyNatRuleCollectionActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyNatRuleCollectionActionArgs Empty = new FirewallPolicyNatRuleCollectionActionArgs();

    /**
     * The type of action.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<Either<String,FirewallPolicyNatRuleCollectionActionType>> type;

    public Input<Either<String,FirewallPolicyNatRuleCollectionActionType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public FirewallPolicyNatRuleCollectionActionArgs(@Nullable Input<Either<String,FirewallPolicyNatRuleCollectionActionType>> type) {
        this.type = type;
    }

    private FirewallPolicyNatRuleCollectionActionArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyNatRuleCollectionActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,FirewallPolicyNatRuleCollectionActionType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyNatRuleCollectionActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<Either<String,FirewallPolicyNatRuleCollectionActionType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,FirewallPolicyNatRuleCollectionActionType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public FirewallPolicyNatRuleCollectionActionArgs build() {
            return new FirewallPolicyNatRuleCollectionActionArgs(type);
        }
    }
}
