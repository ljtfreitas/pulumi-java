// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * KeyPolicy assigned to the storage account.
 * 
 */
public final class KeyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyPolicyArgs Empty = new KeyPolicyArgs();

    /**
     * The key expiration period in days.
     * 
     */
    @InputImport(name="keyExpirationPeriodInDays", required=true)
        private final Input<Integer> keyExpirationPeriodInDays;

    public Input<Integer> getKeyExpirationPeriodInDays() {
        return this.keyExpirationPeriodInDays;
    }

    public KeyPolicyArgs(Input<Integer> keyExpirationPeriodInDays) {
        this.keyExpirationPeriodInDays = Objects.requireNonNull(keyExpirationPeriodInDays, "expected parameter 'keyExpirationPeriodInDays' to be non-null");
    }

    private KeyPolicyArgs() {
        this.keyExpirationPeriodInDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> keyExpirationPeriodInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyExpirationPeriodInDays = defaults.keyExpirationPeriodInDays;
        }

        public Builder setKeyExpirationPeriodInDays(Input<Integer> keyExpirationPeriodInDays) {
            this.keyExpirationPeriodInDays = Objects.requireNonNull(keyExpirationPeriodInDays);
            return this;
        }

        public Builder setKeyExpirationPeriodInDays(Integer keyExpirationPeriodInDays) {
            this.keyExpirationPeriodInDays = Input.of(Objects.requireNonNull(keyExpirationPeriodInDays));
            return this;
        }
        public KeyPolicyArgs build() {
            return new KeyPolicyArgs(keyExpirationPeriodInDays);
        }
    }
}
