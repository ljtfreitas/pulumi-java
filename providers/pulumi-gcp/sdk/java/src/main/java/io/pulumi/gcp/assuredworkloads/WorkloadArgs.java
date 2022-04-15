// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.assuredworkloads;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.assuredworkloads.inputs.WorkloadKmsSettingsArgs;
import io.pulumi.gcp.assuredworkloads.inputs.WorkloadResourceSettingArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkloadArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadArgs Empty = new WorkloadArgs();

    /**
     * Required. Input only. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, 'billingAccounts/012345-567890-ABCDEF`.
     * 
     */
    @Import(name="billingAccount", required=true)
      private final Output<String> billingAccount;

    public Output<String> billingAccount() {
        return this.billingAccount;
    }

    /**
     * Required. Immutable. Compliance Regime associated with this workload. Possible values: COMPLIANCE_REGIME_UNSPECIFIED, IL4, CJIS, FEDRAMP_HIGH, FEDRAMP_MODERATE, US_REGIONAL_ACCESS
     * 
     */
    @Import(name="complianceRegime", required=true)
      private final Output<String> complianceRegime;

    public Output<String> complianceRegime() {
        return this.complianceRegime;
    }

    /**
     * Required. The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key is provisioned. This field is mandatory for a subset of Compliance Regimes.
     * 
     */
    @Import(name="kmsSettings")
      private final @Nullable Output<WorkloadKmsSettingsArgs> kmsSettings;

    public Output<WorkloadKmsSettingsArgs> kmsSettings() {
        return this.kmsSettings == null ? Codegen.empty() : this.kmsSettings;
    }

    /**
     * Optional. Labels applied to the workload.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    /**
     * The organization for the resource
     * 
     */
    @Import(name="organization", required=true)
      private final Output<String> organization;

    public Output<String> organization() {
        return this.organization;
    }

    /**
     * Input only. The parent resource for the resources managed by this Assured Workload. May be either an organization or a folder. Must be the same or a child of the Workload parent. If not specified all resources are created under the Workload parent. Formats: folders/{folder_id}, organizations/{organization_id}
     * 
     */
    @Import(name="provisionedResourcesParent")
      private final @Nullable Output<String> provisionedResourcesParent;

    public Output<String> provisionedResourcesParent() {
        return this.provisionedResourcesParent == null ? Codegen.empty() : this.provisionedResourcesParent;
    }

    /**
     * Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
     * 
     */
    @Import(name="resourceSettings")
      private final @Nullable Output<List<WorkloadResourceSettingArgs>> resourceSettings;

    public Output<List<WorkloadResourceSettingArgs>> resourceSettings() {
        return this.resourceSettings == null ? Codegen.empty() : this.resourceSettings;
    }

    public WorkloadArgs(
        Output<String> billingAccount,
        Output<String> complianceRegime,
        Output<String> displayName,
        @Nullable Output<WorkloadKmsSettingsArgs> kmsSettings,
        @Nullable Output<Map<String,String>> labels,
        Output<String> location,
        Output<String> organization,
        @Nullable Output<String> provisionedResourcesParent,
        @Nullable Output<List<WorkloadResourceSettingArgs>> resourceSettings) {
        this.billingAccount = Objects.requireNonNull(billingAccount, "expected parameter 'billingAccount' to be non-null");
        this.complianceRegime = Objects.requireNonNull(complianceRegime, "expected parameter 'complianceRegime' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.kmsSettings = kmsSettings;
        this.labels = labels;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.organization = Objects.requireNonNull(organization, "expected parameter 'organization' to be non-null");
        this.provisionedResourcesParent = provisionedResourcesParent;
        this.resourceSettings = resourceSettings;
    }

    private WorkloadArgs() {
        this.billingAccount = Codegen.empty();
        this.complianceRegime = Codegen.empty();
        this.displayName = Codegen.empty();
        this.kmsSettings = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.organization = Codegen.empty();
        this.provisionedResourcesParent = Codegen.empty();
        this.resourceSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> billingAccount;
        private Output<String> complianceRegime;
        private Output<String> displayName;
        private @Nullable Output<WorkloadKmsSettingsArgs> kmsSettings;
        private @Nullable Output<Map<String,String>> labels;
        private Output<String> location;
        private Output<String> organization;
        private @Nullable Output<String> provisionedResourcesParent;
        private @Nullable Output<List<WorkloadResourceSettingArgs>> resourceSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccount = defaults.billingAccount;
    	      this.complianceRegime = defaults.complianceRegime;
    	      this.displayName = defaults.displayName;
    	      this.kmsSettings = defaults.kmsSettings;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.organization = defaults.organization;
    	      this.provisionedResourcesParent = defaults.provisionedResourcesParent;
    	      this.resourceSettings = defaults.resourceSettings;
        }

        public Builder billingAccount(Output<String> billingAccount) {
            this.billingAccount = Objects.requireNonNull(billingAccount);
            return this;
        }
        public Builder billingAccount(String billingAccount) {
            this.billingAccount = Output.of(Objects.requireNonNull(billingAccount));
            return this;
        }
        public Builder complianceRegime(Output<String> complianceRegime) {
            this.complianceRegime = Objects.requireNonNull(complianceRegime);
            return this;
        }
        public Builder complianceRegime(String complianceRegime) {
            this.complianceRegime = Output.of(Objects.requireNonNull(complianceRegime));
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder kmsSettings(@Nullable Output<WorkloadKmsSettingsArgs> kmsSettings) {
            this.kmsSettings = kmsSettings;
            return this;
        }
        public Builder kmsSettings(@Nullable WorkloadKmsSettingsArgs kmsSettings) {
            this.kmsSettings = Codegen.ofNullable(kmsSettings);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
            return this;
        }
        public Builder organization(Output<String> organization) {
            this.organization = Objects.requireNonNull(organization);
            return this;
        }
        public Builder organization(String organization) {
            this.organization = Output.of(Objects.requireNonNull(organization));
            return this;
        }
        public Builder provisionedResourcesParent(@Nullable Output<String> provisionedResourcesParent) {
            this.provisionedResourcesParent = provisionedResourcesParent;
            return this;
        }
        public Builder provisionedResourcesParent(@Nullable String provisionedResourcesParent) {
            this.provisionedResourcesParent = Codegen.ofNullable(provisionedResourcesParent);
            return this;
        }
        public Builder resourceSettings(@Nullable Output<List<WorkloadResourceSettingArgs>> resourceSettings) {
            this.resourceSettings = resourceSettings;
            return this;
        }
        public Builder resourceSettings(@Nullable List<WorkloadResourceSettingArgs> resourceSettings) {
            this.resourceSettings = Codegen.ofNullable(resourceSettings);
            return this;
        }
        public Builder resourceSettings(WorkloadResourceSettingArgs... resourceSettings) {
            return resourceSettings(List.of(resourceSettings));
        }        public WorkloadArgs build() {
            return new WorkloadArgs(billingAccount, complianceRegime, displayName, kmsSettings, labels, location, organization, provisionedResourcesParent, resourceSettings);
        }
    }
}
