// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbidedicated.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An array of administrator user identities
 * 
 */
public final class DedicatedCapacityAdministratorsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DedicatedCapacityAdministratorsResponse Empty = new DedicatedCapacityAdministratorsResponse();

    /**
     * An array of administrator user identities.
     * 
     */
    @InputImport(name="members")
        private final @Nullable List<String> members;

    public List<String> getMembers() {
        return this.members == null ? List.of() : this.members;
    }

    public DedicatedCapacityAdministratorsResponse(@Nullable List<String> members) {
        this.members = members;
    }

    private DedicatedCapacityAdministratorsResponse() {
        this.members = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedCapacityAdministratorsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> members;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedCapacityAdministratorsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.members = defaults.members;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = members;
            return this;
        }
        public DedicatedCapacityAdministratorsResponse build() {
            return new DedicatedCapacityAdministratorsResponse(members);
        }
    }
}
