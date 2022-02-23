// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The BigQuery table where the server writes output.
 * 
 */
public final class GoogleCloudHealthcareV1beta1DicomBigQueryDestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudHealthcareV1beta1DicomBigQueryDestinationResponse Empty = new GoogleCloudHealthcareV1beta1DicomBigQueryDestinationResponse();

    /**
     * Use `write_disposition` instead. If `write_disposition` is specified, this parameter is ignored. force=false is equivalent to write_disposition=WRITE_EMPTY and force=true is equivalent to write_disposition=WRITE_TRUNCATE.
     * 
     */
    @InputImport(name="force", required=true)
      private final Boolean force;

    public Boolean getForce() {
        return this.force;
    }

    /**
     * BigQuery URI to a table, up to 2000 characters long, in the format `bq://projectId.bqDatasetId.tableId`
     * 
     */
    @InputImport(name="tableUri", required=true)
      private final String tableUri;

    public String getTableUri() {
        return this.tableUri;
    }

    /**
     * Determines whether the existing table in the destination is to be overwritten or appended to. If a write_disposition is specified, the `force` parameter is ignored.
     * 
     */
    @InputImport(name="writeDisposition", required=true)
      private final String writeDisposition;

    public String getWriteDisposition() {
        return this.writeDisposition;
    }

    public GoogleCloudHealthcareV1beta1DicomBigQueryDestinationResponse(
        Boolean force,
        String tableUri,
        String writeDisposition) {
        this.force = Objects.requireNonNull(force, "expected parameter 'force' to be non-null");
        this.tableUri = Objects.requireNonNull(tableUri, "expected parameter 'tableUri' to be non-null");
        this.writeDisposition = Objects.requireNonNull(writeDisposition, "expected parameter 'writeDisposition' to be non-null");
    }

    private GoogleCloudHealthcareV1beta1DicomBigQueryDestinationResponse() {
        this.force = null;
        this.tableUri = null;
        this.writeDisposition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudHealthcareV1beta1DicomBigQueryDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean force;
        private String tableUri;
        private String writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudHealthcareV1beta1DicomBigQueryDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.force = defaults.force;
    	      this.tableUri = defaults.tableUri;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder setForce(Boolean force) {
            this.force = Objects.requireNonNull(force);
            return this;
        }

        public Builder setTableUri(String tableUri) {
            this.tableUri = Objects.requireNonNull(tableUri);
            return this;
        }

        public Builder setWriteDisposition(String writeDisposition) {
            this.writeDisposition = Objects.requireNonNull(writeDisposition);
            return this;
        }
        public GoogleCloudHealthcareV1beta1DicomBigQueryDestinationResponse build() {
            return new GoogleCloudHealthcareV1beta1DicomBigQueryDestinationResponse(force, tableUri, writeDisposition);
        }
    }
}
