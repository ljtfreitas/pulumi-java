// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azuredata.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSqlServerResult {
    /**
     * Cores of the Sql Server.
     * 
     */
    private final @Nullable Integer cores;
    /**
     * Sql Server Edition.
     * 
     */
    private final @Nullable String edition;
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Sql Server Json Property Bag.
     * 
     */
    private final @Nullable String propertyBag;
    /**
     * ID for Parent Sql Server Registration.
     * 
     */
    private final @Nullable String registrationID;
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;
    /**
     * Version of the Sql Server.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"cores","edition","id","name","propertyBag","registrationID","type","version"})
    private GetSqlServerResult(
        @Nullable Integer cores,
        @Nullable String edition,
        String id,
        String name,
        @Nullable String propertyBag,
        @Nullable String registrationID,
        String type,
        @Nullable String version) {
        this.cores = cores;
        this.edition = edition;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.propertyBag = propertyBag;
        this.registrationID = registrationID;
        this.type = Objects.requireNonNull(type);
        this.version = version;
    }

    /**
     * Cores of the Sql Server.
     * 
     */
    public Optional<Integer> getCores() {
        return Optional.ofNullable(this.cores);
    }
    /**
     * Sql Server Edition.
     * 
     */
    public Optional<String> getEdition() {
        return Optional.ofNullable(this.edition);
    }
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Sql Server Json Property Bag.
     * 
     */
    public Optional<String> getPropertyBag() {
        return Optional.ofNullable(this.propertyBag);
    }
    /**
     * ID for Parent Sql Server Registration.
     * 
     */
    public Optional<String> getRegistrationID() {
        return Optional.ofNullable(this.registrationID);
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Version of the Sql Server.
     * 
     */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlServerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer cores;
        private @Nullable String edition;
        private String id;
        private String name;
        private @Nullable String propertyBag;
        private @Nullable String registrationID;
        private String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cores = defaults.cores;
    	      this.edition = defaults.edition;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.propertyBag = defaults.propertyBag;
    	      this.registrationID = defaults.registrationID;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setCores(@Nullable Integer cores) {
            this.cores = cores;
            return this;
        }

        public Builder setEdition(@Nullable String edition) {
            this.edition = edition;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPropertyBag(@Nullable String propertyBag) {
            this.propertyBag = propertyBag;
            return this;
        }

        public Builder setRegistrationID(@Nullable String registrationID) {
            this.registrationID = registrationID;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GetSqlServerResult build() {
            return new GetSqlServerResult(cores, edition, id, name, propertyBag, registrationID, type, version);
        }
    }
}
