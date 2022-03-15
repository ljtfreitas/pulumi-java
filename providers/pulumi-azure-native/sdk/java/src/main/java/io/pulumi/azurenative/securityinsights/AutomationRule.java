// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.AutomationRuleArgs;
import io.pulumi.azurenative.securityinsights.outputs.AutomationRuleModifyPropertiesActionResponse;
import io.pulumi.azurenative.securityinsights.outputs.AutomationRuleRunPlaybookActionResponse;
import io.pulumi.azurenative.securityinsights.outputs.AutomationRuleTriggeringLogicResponse;
import io.pulumi.azurenative.securityinsights.outputs.ClientInfoResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents an automation rule.
 * API Version: 2019-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:AutomationRule 73e01a99-5cd7-4139-a149-9f2736ff2ab5 /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/incidents/73e01a99-5cd7-4139-a149-9f2736ff2ab5 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:AutomationRule")
public class AutomationRule extends io.pulumi.resources.CustomResource {
    /**
     * The actions to execute when the automation rule is triggered
     * 
     */
    @Export(name="actions", type=List.class, parameters={Either.class})
    private Output<List<Either<AutomationRuleModifyPropertiesActionResponse,AutomationRuleRunPlaybookActionResponse>>> actions;

    /**
     * @return The actions to execute when the automation rule is triggered
     * 
     */
    public Output<List<Either<AutomationRuleModifyPropertiesActionResponse,AutomationRuleRunPlaybookActionResponse>>> getActions() {
        return this.actions;
    }
    /**
     * Describes the client that created the automation rule
     * 
     */
    @Export(name="createdBy", type=ClientInfoResponse.class, parameters={})
    private Output<ClientInfoResponse> createdBy;

    /**
     * @return Describes the client that created the automation rule
     * 
     */
    public Output<ClientInfoResponse> getCreatedBy() {
        return this.createdBy;
    }
    /**
     * The time the automation rule was created
     * 
     */
    @Export(name="createdTimeUtc", type=String.class, parameters={})
    private Output<String> createdTimeUtc;

    /**
     * @return The time the automation rule was created
     * 
     */
    public Output<String> getCreatedTimeUtc() {
        return this.createdTimeUtc;
    }
    /**
     * The display name of the automation  rule
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name of the automation  rule
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Etag of the azure resource
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Etag of the azure resource
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Describes the client that last updated the automation rule
     * 
     */
    @Export(name="lastModifiedBy", type=ClientInfoResponse.class, parameters={})
    private Output<ClientInfoResponse> lastModifiedBy;

    /**
     * @return Describes the client that last updated the automation rule
     * 
     */
    public Output<ClientInfoResponse> getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * The last time the automation rule was updated
     * 
     */
    @Export(name="lastModifiedTimeUtc", type=String.class, parameters={})
    private Output<String> lastModifiedTimeUtc;

    /**
     * @return The last time the automation rule was updated
     * 
     */
    public Output<String> getLastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The order of execution of the automation rule
     * 
     */
    @Export(name="order", type=Integer.class, parameters={})
    private Output<Integer> order;

    /**
     * @return The order of execution of the automation rule
     * 
     */
    public Output<Integer> getOrder() {
        return this.order;
    }
    /**
     * The triggering logic of the automation rule
     * 
     */
    @Export(name="triggeringLogic", type=AutomationRuleTriggeringLogicResponse.class, parameters={})
    private Output<AutomationRuleTriggeringLogicResponse> triggeringLogic;

    /**
     * @return The triggering logic of the automation rule
     * 
     */
    public Output<AutomationRuleTriggeringLogicResponse> getTriggeringLogic() {
        return this.triggeringLogic;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(AutomationRuleArgs.Builder a);
    }
    private static io.pulumi.azurenative.securityinsights.AutomationRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.securityinsights.AutomationRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AutomationRule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutomationRule(String name) {
        this(name, AutomationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutomationRule(String name, AutomationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutomationRule(String name, AutomationRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:AutomationRule", name, args == null ? AutomationRuleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AutomationRule(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:AutomationRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:securityinsights/v20190101preview:AutomationRule").build()),
                Output.of(Alias.builder().setType("azure-native:securityinsights/v20210901preview:AutomationRule").build())
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
    public static AutomationRule get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AutomationRule(name, id, options);
    }
}
