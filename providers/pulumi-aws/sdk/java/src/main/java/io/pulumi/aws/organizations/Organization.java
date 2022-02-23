// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.organizations.OrganizationArgs;
import io.pulumi.aws.organizations.inputs.OrganizationState;
import io.pulumi.aws.organizations.outputs.OrganizationAccount;
import io.pulumi.aws.organizations.outputs.OrganizationNonMasterAccount;
import io.pulumi.aws.organizations.outputs.OrganizationRoot;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a resource to create an organization.
 * 
 * !> **WARNING:** When migrating from a `feature_set` of `CONSOLIDATED_BILLING` to `ALL`, the Organization account owner will received an email stating the following: "You started the process to enable all features for your AWS organization. As part of that process, all member accounts that joined your organization by invitation must approve the change. You don’t need approval from member accounts that you directly created from within your AWS organization." After all member accounts have accepted the invitation, the Organization account owner must then finalize the changes via the [AWS Console](https://console.aws.amazon.com/organizations/home#/organization/settings/migration-progress). Until these steps are performed, the provider will perpetually show a difference, and the `DescribeOrganization` API will continue to show the `FeatureSet` as `CONSOLIDATED_BILLING`. See the [AWS Organizations documentation](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html) for more information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * The AWS organization can be imported by using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:organizations/organization:Organization my_org o-1234567
 * ```
 * 
 */
@ResourceType(type="aws:organizations/organization:Organization")
public class Organization extends io.pulumi.resources.CustomResource {
    /**
     * List of organization accounts including the master account. For a list excluding the master account, see the `non_master_accounts` attribute. All elements have these attributes:
     * 
     */
    @OutputExport(name="accounts", type=List.class, parameters={OrganizationAccount.class})
    private Output<List<OrganizationAccount>> accounts;

    /**
     * @return List of organization accounts including the master account. For a list excluding the master account, see the `non_master_accounts` attribute. All elements have these attributes:
     * 
     */
    public Output<List<OrganizationAccount>> getAccounts() {
        return this.accounts;
    }
    /**
     * ARN of the root
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the root
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `feature_set` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
     * 
     */
    @OutputExport(name="awsServiceAccessPrincipals", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> awsServiceAccessPrincipals;

    /**
     * @return List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `feature_set` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
     * 
     */
    public Output</* @Nullable */ List<String>> getAwsServiceAccessPrincipals() {
        return this.awsServiceAccessPrincipals;
    }
    /**
     * List of Organizations policy types to enable in the Organization Root. Organization must have `feature_set` set to `ALL`. For additional information about valid policy types (e.g., `AISERVICES_OPT_OUT_POLICY`, `BACKUP_POLICY`, `SERVICE_CONTROL_POLICY`, and `TAG_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
     * 
     */
    @OutputExport(name="enabledPolicyTypes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> enabledPolicyTypes;

    /**
     * @return List of Organizations policy types to enable in the Organization Root. Organization must have `feature_set` set to `ALL`. For additional information about valid policy types (e.g., `AISERVICES_OPT_OUT_POLICY`, `BACKUP_POLICY`, `SERVICE_CONTROL_POLICY`, and `TAG_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
     * 
     */
    public Output</* @Nullable */ List<String>> getEnabledPolicyTypes() {
        return this.enabledPolicyTypes;
    }
    /**
     * Specify "ALL" (default) or "CONSOLIDATED_BILLING".
     * 
     */
    @OutputExport(name="featureSet", type=String.class, parameters={})
    private Output</* @Nullable */ String> featureSet;

    /**
     * @return Specify "ALL" (default) or "CONSOLIDATED_BILLING".
     * 
     */
    public Output</* @Nullable */ String> getFeatureSet() {
        return this.featureSet;
    }
    /**
     * ARN of the master account
     * 
     */
    @OutputExport(name="masterAccountArn", type=String.class, parameters={})
    private Output<String> masterAccountArn;

    /**
     * @return ARN of the master account
     * 
     */
    public Output<String> getMasterAccountArn() {
        return this.masterAccountArn;
    }
    /**
     * Email address of the master account
     * 
     */
    @OutputExport(name="masterAccountEmail", type=String.class, parameters={})
    private Output<String> masterAccountEmail;

    /**
     * @return Email address of the master account
     * 
     */
    public Output<String> getMasterAccountEmail() {
        return this.masterAccountEmail;
    }
    /**
     * Identifier of the master account
     * 
     */
    @OutputExport(name="masterAccountId", type=String.class, parameters={})
    private Output<String> masterAccountId;

    /**
     * @return Identifier of the master account
     * 
     */
    public Output<String> getMasterAccountId() {
        return this.masterAccountId;
    }
    /**
     * List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
     * 
     */
    @OutputExport(name="nonMasterAccounts", type=List.class, parameters={OrganizationNonMasterAccount.class})
    private Output<List<OrganizationNonMasterAccount>> nonMasterAccounts;

    /**
     * @return List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
     * 
     */
    public Output<List<OrganizationNonMasterAccount>> getNonMasterAccounts() {
        return this.nonMasterAccounts;
    }
    /**
     * List of organization roots. All elements have these attributes:
     * 
     */
    @OutputExport(name="roots", type=List.class, parameters={OrganizationRoot.class})
    private Output<List<OrganizationRoot>> roots;

    /**
     * @return List of organization roots. All elements have these attributes:
     * 
     */
    public Output<List<OrganizationRoot>> getRoots() {
        return this.roots;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Organization(String name, @Nullable OrganizationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:organizations/organization:Organization", name, args == null ? OrganizationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Organization(String name, Input<String> id, @Nullable OrganizationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:organizations/organization:Organization", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Organization get(String name, Input<String> id, @Nullable OrganizationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Organization(name, id, state, options);
    }
}