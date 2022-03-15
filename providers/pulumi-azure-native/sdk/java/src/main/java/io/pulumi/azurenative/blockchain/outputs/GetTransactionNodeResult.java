// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain.outputs;

import io.pulumi.azurenative.blockchain.outputs.FirewallRuleResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTransactionNodeResult {
    /**
     * Gets or sets the transaction node dns endpoint.
     * 
     */
    private final String dns;
    /**
     * Gets or sets the firewall rules.
     * 
     */
    private final @Nullable List<FirewallRuleResponse> firewallRules;
    /**
     * Fully qualified resource Id of the resource.
     * 
     */
    private final String id;
    /**
     * Gets or sets the transaction node location.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * Sets the transaction node dns endpoint basic auth password.
     * 
     */
    private final @Nullable String password;
    /**
     * Gets or sets the blockchain member provision state.
     * 
     */
    private final String provisioningState;
    /**
     * Gets or sets the transaction node public key.
     * 
     */
    private final String publicKey;
    /**
     * The type of the service - e.g. "Microsoft.Blockchain"
     * 
     */
    private final String type;
    /**
     * Gets or sets the transaction node dns endpoint basic auth user name.
     * 
     */
    private final String userName;

    @CustomType.Constructor
    private GetTransactionNodeResult(
        @CustomType.Parameter("dns") String dns,
        @CustomType.Parameter("firewallRules") @Nullable List<FirewallRuleResponse> firewallRules,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicKey") String publicKey,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userName") String userName) {
        this.dns = dns;
        this.firewallRules = firewallRules;
        this.id = id;
        this.location = location;
        this.name = name;
        this.password = password;
        this.provisioningState = provisioningState;
        this.publicKey = publicKey;
        this.type = type;
        this.userName = userName;
    }

    /**
     * Gets or sets the transaction node dns endpoint.
     * 
    */
    public String getDns() {
        return this.dns;
    }
    /**
     * Gets or sets the firewall rules.
     * 
    */
    public List<FirewallRuleResponse> getFirewallRules() {
        return this.firewallRules == null ? List.of() : this.firewallRules;
    }
    /**
     * Fully qualified resource Id of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets or sets the transaction node location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Sets the transaction node dns endpoint basic auth password.
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Gets or sets the blockchain member provision state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the transaction node public key.
     * 
    */
    public String getPublicKey() {
        return this.publicKey;
    }
    /**
     * The type of the service - e.g. "Microsoft.Blockchain"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Gets or sets the transaction node dns endpoint basic auth user name.
     * 
    */
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransactionNodeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dns;
        private @Nullable List<FirewallRuleResponse> firewallRules;
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable String password;
        private String provisioningState;
        private String publicKey;
        private String type;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransactionNodeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dns = defaults.dns;
    	      this.firewallRules = defaults.firewallRules;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicKey = defaults.publicKey;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder dns(String dns) {
            this.dns = Objects.requireNonNull(dns);
            return this;
        }

        public Builder firewallRules(@Nullable List<FirewallRuleResponse> firewallRules) {
            this.firewallRules = firewallRules;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder publicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public GetTransactionNodeResult build() {
            return new GetTransactionNodeResult(dns, firewallRules, id, location, name, password, provisioningState, publicKey, type, userName);
        }
    }
}
