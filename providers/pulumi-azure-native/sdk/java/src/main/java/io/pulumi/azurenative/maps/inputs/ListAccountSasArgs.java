// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maps.inputs;

import io.pulumi.azurenative.maps.enums.SigningKey;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListAccountSasArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListAccountSasArgs Empty = new ListAccountSasArgs();

    /**
     * The name of the Maps Account.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The date time offset of when the token validity expires. For example "2017-05-24T10:42:03.1567373Z"
     * 
     */
    @InputImport(name="expiry", required=true)
    private final String expiry;

    public String getExpiry() {
        return this.expiry;
    }

    /**
     * Required parameter which represents the desired maximum request per second to allowed for the given SAS token. This does not guarantee perfect accuracy in measurements but provides application safe guards of abuse with eventual enforcement.
     * 
     */
    @InputImport(name="maxRatePerSecond", required=true)
    private final Integer maxRatePerSecond;

    public Integer getMaxRatePerSecond() {
        return this.maxRatePerSecond;
    }

    /**
     * The principal Id also known as the object Id of a User Assigned Managed Identity currently assigned to the Map Account. To assign a Managed Identity of the account, use operation Create or Update an assign a User Assigned Identity resource Id.
     * 
     */
    @InputImport(name="principalId", required=true)
    private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * Optional, allows control of which region locations are permitted access to Azure Maps REST APIs with the SAS token. Example: "eastus", "westus2". Omitting this parameter will allow all region locations to be accessible.
     * 
     */
    @InputImport(name="regions")
    private final @Nullable List<String> regions;

    public List<String> getRegions() {
        return this.regions == null ? List.of() : this.regions;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Map account key to use for signing.
     * 
     */
    @InputImport(name="signingKey", required=true)
    private final Either<String,SigningKey> signingKey;

    public Either<String,SigningKey> getSigningKey() {
        return this.signingKey;
    }

    /**
     * The date time offset of when the token validity begins. For example "2017-05-24T10:42:03.1567373Z".
     * 
     */
    @InputImport(name="start", required=true)
    private final String start;

    public String getStart() {
        return this.start;
    }

    public ListAccountSasArgs(
        String accountName,
        String expiry,
        Integer maxRatePerSecond,
        String principalId,
        @Nullable List<String> regions,
        String resourceGroupName,
        Either<String,SigningKey> signingKey,
        String start) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.expiry = Objects.requireNonNull(expiry, "expected parameter 'expiry' to be non-null");
        this.maxRatePerSecond = maxRatePerSecond == null ? 500 : Objects.requireNonNull(maxRatePerSecond, "expected parameter 'maxRatePerSecond' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.regions = regions;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.signingKey = Objects.requireNonNull(signingKey, "expected parameter 'signingKey' to be non-null");
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
    }

    private ListAccountSasArgs() {
        this.accountName = null;
        this.expiry = null;
        this.maxRatePerSecond = null;
        this.principalId = null;
        this.regions = List.of();
        this.resourceGroupName = null;
        this.signingKey = null;
        this.start = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAccountSasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String expiry;
        private Integer maxRatePerSecond;
        private String principalId;
        private @Nullable List<String> regions;
        private String resourceGroupName;
        private Either<String,SigningKey> signingKey;
        private String start;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAccountSasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.expiry = defaults.expiry;
    	      this.maxRatePerSecond = defaults.maxRatePerSecond;
    	      this.principalId = defaults.principalId;
    	      this.regions = defaults.regions;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.signingKey = defaults.signingKey;
    	      this.start = defaults.start;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setExpiry(String expiry) {
            this.expiry = Objects.requireNonNull(expiry);
            return this;
        }

        public Builder setMaxRatePerSecond(Integer maxRatePerSecond) {
            this.maxRatePerSecond = Objects.requireNonNull(maxRatePerSecond);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSigningKey(Either<String,SigningKey> signingKey) {
            this.signingKey = Objects.requireNonNull(signingKey);
            return this;
        }

        public Builder setStart(String start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }

        public ListAccountSasArgs build() {
            return new ListAccountSasArgs(accountName, expiry, maxRatePerSecond, principalId, regions, resourceGroupName, signingKey, start);
        }
    }
}
