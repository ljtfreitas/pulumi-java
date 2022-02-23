// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CryptoKeyIAMBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final CryptoKeyIAMBindingArgs Empty = new CryptoKeyIAMBindingArgs();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @InputImport(name="condition")
        private final @Nullable Input<CryptoKeyIAMBindingConditionArgs> condition;

    public Input<CryptoKeyIAMBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * The crypto key ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
     * the provider's project setting will be used as a fallback.
     * 
     */
    @InputImport(name="cryptoKeyId", required=true)
        private final Input<String> cryptoKeyId;

    public Input<String> getCryptoKeyId() {
        return this.cryptoKeyId;
    }

    @InputImport(name="members", required=true)
        private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
    }

    /**
     * The role that should be applied. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
        private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public CryptoKeyIAMBindingArgs(
        @Nullable Input<CryptoKeyIAMBindingConditionArgs> condition,
        Input<String> cryptoKeyId,
        Input<List<String>> members,
        Input<String> role) {
        this.condition = condition;
        this.cryptoKeyId = Objects.requireNonNull(cryptoKeyId, "expected parameter 'cryptoKeyId' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private CryptoKeyIAMBindingArgs() {
        this.condition = Input.empty();
        this.cryptoKeyId = Input.empty();
        this.members = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyIAMBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CryptoKeyIAMBindingConditionArgs> condition;
        private Input<String> cryptoKeyId;
        private Input<List<String>> members;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyIAMBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.cryptoKeyId = defaults.cryptoKeyId;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<CryptoKeyIAMBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable CryptoKeyIAMBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setCryptoKeyId(Input<String> cryptoKeyId) {
            this.cryptoKeyId = Objects.requireNonNull(cryptoKeyId);
            return this;
        }

        public Builder setCryptoKeyId(String cryptoKeyId) {
            this.cryptoKeyId = Input.of(Objects.requireNonNull(cryptoKeyId));
            return this;
        }

        public Builder setMembers(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }
        public CryptoKeyIAMBindingArgs build() {
            return new CryptoKeyIAMBindingArgs(condition, cryptoKeyId, members, role);
        }
    }
}
