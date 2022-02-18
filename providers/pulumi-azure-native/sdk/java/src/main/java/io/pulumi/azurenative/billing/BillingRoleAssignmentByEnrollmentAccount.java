// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.billing;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.billing.BillingRoleAssignmentByEnrollmentAccountArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The role assignment
 * API Version: 2019-10-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:billing:BillingRoleAssignmentByEnrollmentAccount 9dfd08c2-62a3-4d47-85bd-1cdba1408402 /providers/Microsoft.Billing/billingAccounts/7898901/enrollmentAccounts/225314/billingRoleAssignments/9dfd08c2-62a3-4d47-85bd-1cdba1408402 
 * ```
 * 
 */
@ResourceType(type="azure-native:billing:BillingRoleAssignmentByEnrollmentAccount")
public class BillingRoleAssignmentByEnrollmentAccount extends io.pulumi.resources.CustomResource {
    /**
     * The principal Id of the user who created the role assignment.
     * 
     */
    @OutputExport(name="createdByPrincipalId", type=String.class, parameters={})
    private Output<String> createdByPrincipalId;

    /**
     * @return The principal Id of the user who created the role assignment.
     * 
     */
    public Output<String> getCreatedByPrincipalId() {
        return this.createdByPrincipalId;
    }
    /**
     * The tenant Id of the user who created the role assignment.
     * 
     */
    @OutputExport(name="createdByPrincipalTenantId", type=String.class, parameters={})
    private Output<String> createdByPrincipalTenantId;

    /**
     * @return The tenant Id of the user who created the role assignment.
     * 
     */
    public Output<String> getCreatedByPrincipalTenantId() {
        return this.createdByPrincipalTenantId;
    }
    /**
     * The email address of the user who created the role assignment. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    @OutputExport(name="createdByUserEmailAddress", type=String.class, parameters={})
    private Output<String> createdByUserEmailAddress;

    /**
     * @return The email address of the user who created the role assignment. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    public Output<String> getCreatedByUserEmailAddress() {
        return this.createdByUserEmailAddress;
    }
    /**
     * The date the role assignment was created.
     * 
     */
    @OutputExport(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    /**
     * @return The date the role assignment was created.
     * 
     */
    public Output<String> getCreatedOn() {
        return this.createdOn;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The principal id of the user to whom the role was assigned.
     * 
     */
    @OutputExport(name="principalId", type=String.class, parameters={})
    private Output</* @Nullable */ String> principalId;

    /**
     * @return The principal id of the user to whom the role was assigned.
     * 
     */
    public Output</* @Nullable */ String> getPrincipalId() {
        return this.principalId;
    }
    /**
     * The principal tenant id of the user to whom the role was assigned.
     * 
     */
    @OutputExport(name="principalTenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> principalTenantId;

    /**
     * @return The principal tenant id of the user to whom the role was assigned.
     * 
     */
    public Output</* @Nullable */ String> getPrincipalTenantId() {
        return this.principalTenantId;
    }
    /**
     * The ID of the role definition.
     * 
     */
    @OutputExport(name="roleDefinitionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleDefinitionId;

    /**
     * @return The ID of the role definition.
     * 
     */
    public Output</* @Nullable */ String> getRoleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * The scope at which the role was assigned.
     * 
     */
    @OutputExport(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return The scope at which the role was assigned.
     * 
     */
    public Output<String> getScope() {
        return this.scope;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The authentication type of the user, whether Organization or MSA, of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    @OutputExport(name="userAuthenticationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> userAuthenticationType;

    /**
     * @return The authentication type of the user, whether Organization or MSA, of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    public Output</* @Nullable */ String> getUserAuthenticationType() {
        return this.userAuthenticationType;
    }
    /**
     * The email address of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    @OutputExport(name="userEmailAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> userEmailAddress;

    /**
     * @return The email address of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    public Output</* @Nullable */ String> getUserEmailAddress() {
        return this.userEmailAddress;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BillingRoleAssignmentByEnrollmentAccount(String name, BillingRoleAssignmentByEnrollmentAccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:billing:BillingRoleAssignmentByEnrollmentAccount", name, args == null ? BillingRoleAssignmentByEnrollmentAccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BillingRoleAssignmentByEnrollmentAccount(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:billing:BillingRoleAssignmentByEnrollmentAccount", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:billing/v20191001preview:BillingRoleAssignmentByEnrollmentAccount").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BillingRoleAssignmentByEnrollmentAccount get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BillingRoleAssignmentByEnrollmentAccount(name, id, options);
    }
}
