// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.enums.HttpProtocol;
import io.pulumi.azurenative.storage.enums.Permissions;
import io.pulumi.azurenative.storage.enums.SignedResource;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListStorageAccountServiceSASArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListStorageAccountServiceSASArgs Empty = new ListStorageAccountServiceSASArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @InputImport(name="accountName", required=true)
        private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The response header override for cache control.
     * 
     */
    @InputImport(name="cacheControl")
        private final @Nullable String cacheControl;

    public Optional<String> getCacheControl() {
        return this.cacheControl == null ? Optional.empty() : Optional.ofNullable(this.cacheControl);
    }

    /**
     * The canonical path to the signed resource.
     * 
     */
    @InputImport(name="canonicalizedResource", required=true)
        private final String canonicalizedResource;

    public String getCanonicalizedResource() {
        return this.canonicalizedResource;
    }

    /**
     * The response header override for content disposition.
     * 
     */
    @InputImport(name="contentDisposition")
        private final @Nullable String contentDisposition;

    public Optional<String> getContentDisposition() {
        return this.contentDisposition == null ? Optional.empty() : Optional.ofNullable(this.contentDisposition);
    }

    /**
     * The response header override for content encoding.
     * 
     */
    @InputImport(name="contentEncoding")
        private final @Nullable String contentEncoding;

    public Optional<String> getContentEncoding() {
        return this.contentEncoding == null ? Optional.empty() : Optional.ofNullable(this.contentEncoding);
    }

    /**
     * The response header override for content language.
     * 
     */
    @InputImport(name="contentLanguage")
        private final @Nullable String contentLanguage;

    public Optional<String> getContentLanguage() {
        return this.contentLanguage == null ? Optional.empty() : Optional.ofNullable(this.contentLanguage);
    }

    /**
     * The response header override for content type.
     * 
     */
    @InputImport(name="contentType")
        private final @Nullable String contentType;

    public Optional<String> getContentType() {
        return this.contentType == null ? Optional.empty() : Optional.ofNullable(this.contentType);
    }

    /**
     * An IP address or a range of IP addresses from which to accept requests.
     * 
     */
    @InputImport(name="iPAddressOrRange")
        private final @Nullable String iPAddressOrRange;

    public Optional<String> getIPAddressOrRange() {
        return this.iPAddressOrRange == null ? Optional.empty() : Optional.ofNullable(this.iPAddressOrRange);
    }

    /**
     * A unique value up to 64 characters in length that correlates to an access policy specified for the container, queue, or table.
     * 
     */
    @InputImport(name="identifier")
        private final @Nullable String identifier;

    public Optional<String> getIdentifier() {
        return this.identifier == null ? Optional.empty() : Optional.ofNullable(this.identifier);
    }

    /**
     * The key to sign the account SAS token with.
     * 
     */
    @InputImport(name="keyToSign")
        private final @Nullable String keyToSign;

    public Optional<String> getKeyToSign() {
        return this.keyToSign == null ? Optional.empty() : Optional.ofNullable(this.keyToSign);
    }

    /**
     * The end of partition key.
     * 
     */
    @InputImport(name="partitionKeyEnd")
        private final @Nullable String partitionKeyEnd;

    public Optional<String> getPartitionKeyEnd() {
        return this.partitionKeyEnd == null ? Optional.empty() : Optional.ofNullable(this.partitionKeyEnd);
    }

    /**
     * The start of partition key.
     * 
     */
    @InputImport(name="partitionKeyStart")
        private final @Nullable String partitionKeyStart;

    public Optional<String> getPartitionKeyStart() {
        return this.partitionKeyStart == null ? Optional.empty() : Optional.ofNullable(this.partitionKeyStart);
    }

    /**
     * The signed permissions for the service SAS. Possible values include: Read (r), Write (w), Delete (d), List (l), Add (a), Create (c), Update (u) and Process (p).
     * 
     */
    @InputImport(name="permissions")
        private final @Nullable Either<String,Permissions> permissions;

    public Either<String,Permissions> getPermissions() {
        return this.permissions == null ? null : this.permissions;
    }

    /**
     * The protocol permitted for a request made with the account SAS.
     * 
     */
    @InputImport(name="protocols")
        private final @Nullable HttpProtocol protocols;

    public Optional<HttpProtocol> getProtocols() {
        return this.protocols == null ? Optional.empty() : Optional.ofNullable(this.protocols);
    }

    /**
     * The signed services accessible with the service SAS. Possible values include: Blob (b), Container (c), File (f), Share (s).
     * 
     */
    @InputImport(name="resource")
        private final @Nullable Either<String,SignedResource> resource;

    public Either<String,SignedResource> getResource() {
        return this.resource == null ? null : this.resource;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The end of row key.
     * 
     */
    @InputImport(name="rowKeyEnd")
        private final @Nullable String rowKeyEnd;

    public Optional<String> getRowKeyEnd() {
        return this.rowKeyEnd == null ? Optional.empty() : Optional.ofNullable(this.rowKeyEnd);
    }

    /**
     * The start of row key.
     * 
     */
    @InputImport(name="rowKeyStart")
        private final @Nullable String rowKeyStart;

    public Optional<String> getRowKeyStart() {
        return this.rowKeyStart == null ? Optional.empty() : Optional.ofNullable(this.rowKeyStart);
    }

    /**
     * The time at which the shared access signature becomes invalid.
     * 
     */
    @InputImport(name="sharedAccessExpiryTime")
        private final @Nullable String sharedAccessExpiryTime;

    public Optional<String> getSharedAccessExpiryTime() {
        return this.sharedAccessExpiryTime == null ? Optional.empty() : Optional.ofNullable(this.sharedAccessExpiryTime);
    }

    /**
     * The time at which the SAS becomes valid.
     * 
     */
    @InputImport(name="sharedAccessStartTime")
        private final @Nullable String sharedAccessStartTime;

    public Optional<String> getSharedAccessStartTime() {
        return this.sharedAccessStartTime == null ? Optional.empty() : Optional.ofNullable(this.sharedAccessStartTime);
    }

    public ListStorageAccountServiceSASArgs(
        String accountName,
        @Nullable String cacheControl,
        String canonicalizedResource,
        @Nullable String contentDisposition,
        @Nullable String contentEncoding,
        @Nullable String contentLanguage,
        @Nullable String contentType,
        @Nullable String iPAddressOrRange,
        @Nullable String identifier,
        @Nullable String keyToSign,
        @Nullable String partitionKeyEnd,
        @Nullable String partitionKeyStart,
        @Nullable Either<String,Permissions> permissions,
        @Nullable HttpProtocol protocols,
        @Nullable Either<String,SignedResource> resource,
        String resourceGroupName,
        @Nullable String rowKeyEnd,
        @Nullable String rowKeyStart,
        @Nullable String sharedAccessExpiryTime,
        @Nullable String sharedAccessStartTime) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.cacheControl = cacheControl;
        this.canonicalizedResource = Objects.requireNonNull(canonicalizedResource, "expected parameter 'canonicalizedResource' to be non-null");
        this.contentDisposition = contentDisposition;
        this.contentEncoding = contentEncoding;
        this.contentLanguage = contentLanguage;
        this.contentType = contentType;
        this.iPAddressOrRange = iPAddressOrRange;
        this.identifier = identifier;
        this.keyToSign = keyToSign;
        this.partitionKeyEnd = partitionKeyEnd;
        this.partitionKeyStart = partitionKeyStart;
        this.permissions = permissions;
        this.protocols = protocols;
        this.resource = resource;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.rowKeyEnd = rowKeyEnd;
        this.rowKeyStart = rowKeyStart;
        this.sharedAccessExpiryTime = sharedAccessExpiryTime;
        this.sharedAccessStartTime = sharedAccessStartTime;
    }

    private ListStorageAccountServiceSASArgs() {
        this.accountName = null;
        this.cacheControl = null;
        this.canonicalizedResource = null;
        this.contentDisposition = null;
        this.contentEncoding = null;
        this.contentLanguage = null;
        this.contentType = null;
        this.iPAddressOrRange = null;
        this.identifier = null;
        this.keyToSign = null;
        this.partitionKeyEnd = null;
        this.partitionKeyStart = null;
        this.permissions = null;
        this.protocols = null;
        this.resource = null;
        this.resourceGroupName = null;
        this.rowKeyEnd = null;
        this.rowKeyStart = null;
        this.sharedAccessExpiryTime = null;
        this.sharedAccessStartTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStorageAccountServiceSASArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private @Nullable String cacheControl;
        private String canonicalizedResource;
        private @Nullable String contentDisposition;
        private @Nullable String contentEncoding;
        private @Nullable String contentLanguage;
        private @Nullable String contentType;
        private @Nullable String iPAddressOrRange;
        private @Nullable String identifier;
        private @Nullable String keyToSign;
        private @Nullable String partitionKeyEnd;
        private @Nullable String partitionKeyStart;
        private @Nullable Either<String,Permissions> permissions;
        private @Nullable HttpProtocol protocols;
        private @Nullable Either<String,SignedResource> resource;
        private String resourceGroupName;
        private @Nullable String rowKeyEnd;
        private @Nullable String rowKeyStart;
        private @Nullable String sharedAccessExpiryTime;
        private @Nullable String sharedAccessStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStorageAccountServiceSASArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.cacheControl = defaults.cacheControl;
    	      this.canonicalizedResource = defaults.canonicalizedResource;
    	      this.contentDisposition = defaults.contentDisposition;
    	      this.contentEncoding = defaults.contentEncoding;
    	      this.contentLanguage = defaults.contentLanguage;
    	      this.contentType = defaults.contentType;
    	      this.iPAddressOrRange = defaults.iPAddressOrRange;
    	      this.identifier = defaults.identifier;
    	      this.keyToSign = defaults.keyToSign;
    	      this.partitionKeyEnd = defaults.partitionKeyEnd;
    	      this.partitionKeyStart = defaults.partitionKeyStart;
    	      this.permissions = defaults.permissions;
    	      this.protocols = defaults.protocols;
    	      this.resource = defaults.resource;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rowKeyEnd = defaults.rowKeyEnd;
    	      this.rowKeyStart = defaults.rowKeyStart;
    	      this.sharedAccessExpiryTime = defaults.sharedAccessExpiryTime;
    	      this.sharedAccessStartTime = defaults.sharedAccessStartTime;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setCacheControl(@Nullable String cacheControl) {
            this.cacheControl = cacheControl;
            return this;
        }

        public Builder setCanonicalizedResource(String canonicalizedResource) {
            this.canonicalizedResource = Objects.requireNonNull(canonicalizedResource);
            return this;
        }

        public Builder setContentDisposition(@Nullable String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        public Builder setContentEncoding(@Nullable String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }

        public Builder setContentLanguage(@Nullable String contentLanguage) {
            this.contentLanguage = contentLanguage;
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setIPAddressOrRange(@Nullable String iPAddressOrRange) {
            this.iPAddressOrRange = iPAddressOrRange;
            return this;
        }

        public Builder setIdentifier(@Nullable String identifier) {
            this.identifier = identifier;
            return this;
        }

        public Builder setKeyToSign(@Nullable String keyToSign) {
            this.keyToSign = keyToSign;
            return this;
        }

        public Builder setPartitionKeyEnd(@Nullable String partitionKeyEnd) {
            this.partitionKeyEnd = partitionKeyEnd;
            return this;
        }

        public Builder setPartitionKeyStart(@Nullable String partitionKeyStart) {
            this.partitionKeyStart = partitionKeyStart;
            return this;
        }

        public Builder setPermissions(@Nullable Either<String,Permissions> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setProtocols(@Nullable HttpProtocol protocols) {
            this.protocols = protocols;
            return this;
        }

        public Builder setResource(@Nullable Either<String,SignedResource> resource) {
            this.resource = resource;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setRowKeyEnd(@Nullable String rowKeyEnd) {
            this.rowKeyEnd = rowKeyEnd;
            return this;
        }

        public Builder setRowKeyStart(@Nullable String rowKeyStart) {
            this.rowKeyStart = rowKeyStart;
            return this;
        }

        public Builder setSharedAccessExpiryTime(@Nullable String sharedAccessExpiryTime) {
            this.sharedAccessExpiryTime = sharedAccessExpiryTime;
            return this;
        }

        public Builder setSharedAccessStartTime(@Nullable String sharedAccessStartTime) {
            this.sharedAccessStartTime = sharedAccessStartTime;
            return this;
        }
        public ListStorageAccountServiceSASArgs build() {
            return new ListStorageAccountServiceSASArgs(accountName, cacheControl, canonicalizedResource, contentDisposition, contentEncoding, contentLanguage, contentType, iPAddressOrRange, identifier, keyToSign, partitionKeyEnd, partitionKeyStart, permissions, protocols, resource, resourceGroupName, rowKeyEnd, rowKeyStart, sharedAccessExpiryTime, sharedAccessStartTime);
        }
    }
}
