// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.MetadataItemsItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A metadata key/value entry.
 * 
 */
public final class MetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetadataResponse Empty = new MetadataResponse();

    /**
     * Specifies a fingerprint for this request, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the resource.
     * 
     */
    @InputImport(name="fingerprint", required=true)
      private final String fingerprint;

    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * Array of key/value pairs. The total size of all keys and values must be less than 512 KB.
     * 
     */
    @InputImport(name="items", required=true)
      private final List<MetadataItemsItemResponse> items;

    public List<MetadataItemsItemResponse> getItems() {
        return this.items;
    }

    /**
     * Type of the resource. Always compute#metadata for metadata.
     * 
     */
    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    public MetadataResponse(
        String fingerprint,
        List<MetadataItemsItemResponse> items,
        String kind) {
        this.fingerprint = Objects.requireNonNull(fingerprint, "expected parameter 'fingerprint' to be non-null");
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
    }

    private MetadataResponse() {
        this.fingerprint = null;
        this.items = List.of();
        this.kind = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fingerprint;
        private List<MetadataItemsItemResponse> items;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fingerprint = defaults.fingerprint;
    	      this.items = defaults.items;
    	      this.kind = defaults.kind;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setItems(List<MetadataItemsItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public MetadataResponse build() {
            return new MetadataResponse(fingerprint, items, kind);
        }
    }
}
