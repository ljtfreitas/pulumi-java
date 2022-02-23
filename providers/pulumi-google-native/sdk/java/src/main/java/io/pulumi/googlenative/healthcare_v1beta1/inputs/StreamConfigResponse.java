// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.GoogleCloudHealthcareV1beta1FhirBigQueryDestinationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Contains configuration for streaming FHIR export.
 * 
 */
public final class StreamConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final StreamConfigResponse Empty = new StreamConfigResponse();

    /**
     * The destination BigQuery structure that contains both the dataset location and corresponding schema config. The output is organized in one table per resource type. The server reuses the existing tables (if any) that are named after the resource types, e.g. "Patient", "Observation". When there is no existing table for a given resource type, the server attempts to create one. When a table schema doesn't align with the schema config, either because of existing incompatible schema or out of band incompatible modification, the server does not stream in new data. One resolution in this case is to delete the incompatible table and let the server recreate one, though the newly created table only contains data after the table recreation. BigQuery imposes a 1 MB limit on streaming insert row size, therefore any resource mutation that generates more than 1 MB of BigQuery data will not be streamed. Results are written to BigQuery tables according to the parameters in BigQueryDestination.WriteDisposition. Different versions of the same resource are distinguishable by the meta.versionId and meta.lastUpdated columns. The operation (CREATE/UPDATE/DELETE) that results in the new version is recorded in the meta.tag. The tables contain all historical resource versions since streaming was enabled. For query convenience, the server also creates one view per table of the same name containing only the current resource version. The streamed data in the BigQuery dataset is not guaranteed to be completely unique. The combination of the id and meta.versionId columns should ideally identify a single unique row. But in rare cases, duplicates may exist. At query time, users may use the SQL select statement to keep only one of the duplicate rows given an id and meta.versionId pair. Alternatively, the server created view mentioned above also filters out duplicates. If a resource mutation cannot be streamed to BigQuery, errors will be logged to Cloud Logging (see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)).
     * 
     */
    @InputImport(name="bigqueryDestination", required=true)
      private final GoogleCloudHealthcareV1beta1FhirBigQueryDestinationResponse bigqueryDestination;

    public GoogleCloudHealthcareV1beta1FhirBigQueryDestinationResponse getBigqueryDestination() {
        return this.bigqueryDestination;
    }

    /**
     * Supply a FHIR resource type (such as "Patient" or "Observation"). See https://www.hl7.org/fhir/valueset-resource-types.html for a list of all FHIR resource types. The server treats an empty list as an intent to stream all the supported resource types in this FHIR store.
     * 
     */
    @InputImport(name="resourceTypes", required=true)
      private final List<String> resourceTypes;

    public List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public StreamConfigResponse(
        GoogleCloudHealthcareV1beta1FhirBigQueryDestinationResponse bigqueryDestination,
        List<String> resourceTypes) {
        this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination, "expected parameter 'bigqueryDestination' to be non-null");
        this.resourceTypes = Objects.requireNonNull(resourceTypes, "expected parameter 'resourceTypes' to be non-null");
    }

    private StreamConfigResponse() {
        this.bigqueryDestination = null;
        this.resourceTypes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudHealthcareV1beta1FhirBigQueryDestinationResponse bigqueryDestination;
        private List<String> resourceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestination = defaults.bigqueryDestination;
    	      this.resourceTypes = defaults.resourceTypes;
        }

        public Builder setBigqueryDestination(GoogleCloudHealthcareV1beta1FhirBigQueryDestinationResponse bigqueryDestination) {
            this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination);
            return this;
        }

        public Builder setResourceTypes(List<String> resourceTypes) {
            this.resourceTypes = Objects.requireNonNull(resourceTypes);
            return this;
        }
        public StreamConfigResponse build() {
            return new StreamConfigResponse(bigqueryDestination, resourceTypes);
        }
    }
}
