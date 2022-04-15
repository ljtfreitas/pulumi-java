// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class DicomStoreIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DicomStoreIamPolicyArgs Empty = new DicomStoreIamPolicyArgs();

    /**
     * The DICOM store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
     * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @Import(name="dicomStoreId", required=true)
      private final Output<String> dicomStoreId;

    public Output<String> dicomStoreId() {
        return this.dicomStoreId;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
      private final Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData;
    }

    public DicomStoreIamPolicyArgs(
        Output<String> dicomStoreId,
        Output<String> policyData) {
        this.dicomStoreId = Objects.requireNonNull(dicomStoreId, "expected parameter 'dicomStoreId' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
    }

    private DicomStoreIamPolicyArgs() {
        this.dicomStoreId = Codegen.empty();
        this.policyData = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dicomStoreId;
        private Output<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dicomStoreId = defaults.dicomStoreId;
    	      this.policyData = defaults.policyData;
        }

        public Builder dicomStoreId(Output<String> dicomStoreId) {
            this.dicomStoreId = Objects.requireNonNull(dicomStoreId);
            return this;
        }
        public Builder dicomStoreId(String dicomStoreId) {
            this.dicomStoreId = Output.of(Objects.requireNonNull(dicomStoreId));
            return this;
        }
        public Builder policyData(Output<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }
        public Builder policyData(String policyData) {
            this.policyData = Output.of(Objects.requireNonNull(policyData));
            return this;
        }        public DicomStoreIamPolicyArgs build() {
            return new DicomStoreIamPolicyArgs(dicomStoreId, policyData);
        }
    }
}
