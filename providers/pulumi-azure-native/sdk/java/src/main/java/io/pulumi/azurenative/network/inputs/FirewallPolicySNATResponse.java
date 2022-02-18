// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The private IP addresses/IP ranges to which traffic will not be SNAT.
 * 
 */
public final class FirewallPolicySNATResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicySNATResponse Empty = new FirewallPolicySNATResponse();

    /**
     * List of private IP addresses/IP address ranges to not be SNAT.
     * 
     */
    @InputImport(name="privateRanges")
    private final @Nullable List<String> privateRanges;

    public List<String> getPrivateRanges() {
        return this.privateRanges == null ? List.of() : this.privateRanges;
    }

    public FirewallPolicySNATResponse(@Nullable List<String> privateRanges) {
        this.privateRanges = privateRanges;
    }

    private FirewallPolicySNATResponse() {
        this.privateRanges = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicySNATResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> privateRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicySNATResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateRanges = defaults.privateRanges;
        }

        public Builder setPrivateRanges(@Nullable List<String> privateRanges) {
            this.privateRanges = privateRanges;
            return this;
        }

        public FirewallPolicySNATResponse build() {
            return new FirewallPolicySNATResponse(privateRanges);
        }
    }
}
