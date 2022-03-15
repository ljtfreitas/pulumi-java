// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.policyinsights.AttestationAtResourceArgs;
import io.pulumi.azurenative.policyinsights.outputs.AttestationEvidenceResponse;
import io.pulumi.azurenative.policyinsights.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An attestation resource.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:policyinsights:AttestationAtResource 790996e6-9871-4b1f-9cd9-ec42cd6ced1e /subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourcegroups/myrg/providers/microsoft.compute/virtualMachines/devVM/providers/microsoft.policyinsights/attestations/790996e6-9871-4b1f-9cd9-ec42cd6ced1e 
 * ```
 * 
 */
@ResourceType(type="azure-native:policyinsights:AttestationAtResource")
public class AttestationAtResource extends io.pulumi.resources.CustomResource {
    /**
     * Comments describing why this attestation was created.
     * 
     */
    @Export(name="comments", type=String.class, parameters={})
    private Output</* @Nullable */ String> comments;

    /**
     * @return Comments describing why this attestation was created.
     * 
     */
    public Output</* @Nullable */ String> getComments() {
        return this.comments;
    }
    /**
     * The compliance state that should be set on the resource.
     * 
     */
    @Export(name="complianceState", type=String.class, parameters={})
    private Output</* @Nullable */ String> complianceState;

    /**
     * @return The compliance state that should be set on the resource.
     * 
     */
    public Output</* @Nullable */ String> getComplianceState() {
        return this.complianceState;
    }
    /**
     * The evidence supporting the compliance state set in this attestation.
     * 
     */
    @Export(name="evidence", type=List.class, parameters={AttestationEvidenceResponse.class})
    private Output</* @Nullable */ List<AttestationEvidenceResponse>> evidence;

    /**
     * @return The evidence supporting the compliance state set in this attestation.
     * 
     */
    public Output</* @Nullable */ List<AttestationEvidenceResponse>> getEvidence() {
        return this.evidence;
    }
    /**
     * The time the compliance state should expire.
     * 
     */
    @Export(name="expiresOn", type=String.class, parameters={})
    private Output</* @Nullable */ String> expiresOn;

    /**
     * @return The time the compliance state should expire.
     * 
     */
    public Output</* @Nullable */ String> getExpiresOn() {
        return this.expiresOn;
    }
    /**
     * The time the compliance state was last changed in this attestation.
     * 
     */
    @Export(name="lastComplianceStateChangeAt", type=String.class, parameters={})
    private Output<String> lastComplianceStateChangeAt;

    /**
     * @return The time the compliance state was last changed in this attestation.
     * 
     */
    public Output<String> getLastComplianceStateChangeAt() {
        return this.lastComplianceStateChangeAt;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The person responsible for setting the state of the resource. This value is typically an Azure Active Directory object ID.
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
    private Output</* @Nullable */ String> owner;

    /**
     * @return The person responsible for setting the state of the resource. This value is typically an Azure Active Directory object ID.
     * 
     */
    public Output</* @Nullable */ String> getOwner() {
        return this.owner;
    }
    /**
     * The resource ID of the policy assignment that the attestation is setting the state for.
     * 
     */
    @Export(name="policyAssignmentId", type=String.class, parameters={})
    private Output<String> policyAssignmentId;

    /**
     * @return The resource ID of the policy assignment that the attestation is setting the state for.
     * 
     */
    public Output<String> getPolicyAssignmentId() {
        return this.policyAssignmentId;
    }
    /**
     * The policy definition reference ID from a policy set definition that the attestation is setting the state for. If the policy assignment assigns a policy set definition the attestation can choose a definition within the set definition with this property or omit this and set the state for the entire set definition.
     * 
     */
    @Export(name="policyDefinitionReferenceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyDefinitionReferenceId;

    /**
     * @return The policy definition reference ID from a policy set definition that the attestation is setting the state for. If the policy assignment assigns a policy set definition the attestation can choose a definition within the set definition with this property or omit this and set the state for the entire set definition.
     * 
     */
    public Output</* @Nullable */ String> getPolicyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId;
    }
    /**
     * The status of the attestation.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The status of the attestation.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(AttestationAtResourceArgs.Builder a);
    }
    private static io.pulumi.azurenative.policyinsights.AttestationAtResourceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.policyinsights.AttestationAtResourceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AttestationAtResource(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AttestationAtResource(String name) {
        this(name, AttestationAtResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AttestationAtResource(String name, AttestationAtResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AttestationAtResource(String name, AttestationAtResourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:policyinsights:AttestationAtResource", name, args == null ? AttestationAtResourceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AttestationAtResource(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:policyinsights:AttestationAtResource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:policyinsights/v20210101:AttestationAtResource").build())
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
    public static AttestationAtResource get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AttestationAtResource(name, id, options);
    }
}
