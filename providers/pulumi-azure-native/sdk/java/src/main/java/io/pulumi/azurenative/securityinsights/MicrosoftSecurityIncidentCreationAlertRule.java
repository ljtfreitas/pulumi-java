// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.MicrosoftSecurityIncidentCreationAlertRuleArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents MicrosoftSecurityIncidentCreation rule.
 * API Version: 2020-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:MicrosoftSecurityIncidentCreationAlertRule 73e01a99-5cd7-4139-a149-9f2736ff2ab5 /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/alertRules/73e01a99-5cd7-4139-a149-9f2736ff2ab5 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:MicrosoftSecurityIncidentCreationAlertRule")
public class MicrosoftSecurityIncidentCreationAlertRule extends io.pulumi.resources.CustomResource {
    /**
     * The Name of the alert rule template used to create this rule.
     * 
     */
    @Export(name="alertRuleTemplateName", type=String.class, parameters={})
    private Output</* @Nullable */ String> alertRuleTemplateName;

    /**
     * @return The Name of the alert rule template used to create this rule.
     * 
     */
    public Output</* @Nullable */ String> getAlertRuleTemplateName() {
        return this.alertRuleTemplateName;
    }
    /**
     * The description of the alert rule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the alert rule.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The display name for alerts created by this alert rule.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name for alerts created by this alert rule.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * the alerts' displayNames on which the cases will not be generated
     * 
     */
    @Export(name="displayNamesExcludeFilter", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> displayNamesExcludeFilter;

    /**
     * @return the alerts' displayNames on which the cases will not be generated
     * 
     */
    public Output</* @Nullable */ List<String>> getDisplayNamesExcludeFilter() {
        return this.displayNamesExcludeFilter;
    }
    /**
     * the alerts' displayNames on which the cases will be generated
     * 
     */
    @Export(name="displayNamesFilter", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> displayNamesFilter;

    /**
     * @return the alerts' displayNames on which the cases will be generated
     * 
     */
    public Output</* @Nullable */ List<String>> getDisplayNamesFilter() {
        return this.displayNamesFilter;
    }
    /**
     * Determines whether this alert rule is enabled or disabled.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Determines whether this alert rule is enabled or disabled.
     * 
     */
    public Output<Boolean> getEnabled() {
        return this.enabled;
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
     * The kind of the alert rule
     * Expected value is 'MicrosoftSecurityIncidentCreation'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the alert rule
     * Expected value is 'MicrosoftSecurityIncidentCreation'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The last time that this alert has been modified.
     * 
     */
    @Export(name="lastModifiedUtc", type=String.class, parameters={})
    private Output<String> lastModifiedUtc;

    /**
     * @return The last time that this alert has been modified.
     * 
     */
    public Output<String> getLastModifiedUtc() {
        return this.lastModifiedUtc;
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
     * The alerts' productName on which the cases will be generated
     * 
     */
    @Export(name="productFilter", type=String.class, parameters={})
    private Output<String> productFilter;

    /**
     * @return The alerts' productName on which the cases will be generated
     * 
     */
    public Output<String> getProductFilter() {
        return this.productFilter;
    }
    /**
     * the alerts' severities on which the cases will be generated
     * 
     */
    @Export(name="severitiesFilter", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> severitiesFilter;

    /**
     * @return the alerts' severities on which the cases will be generated
     * 
     */
    public Output</* @Nullable */ List<String>> getSeveritiesFilter() {
        return this.severitiesFilter;
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
        public void apply(MicrosoftSecurityIncidentCreationAlertRuleArgs.Builder a);
    }
    private static io.pulumi.azurenative.securityinsights.MicrosoftSecurityIncidentCreationAlertRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.securityinsights.MicrosoftSecurityIncidentCreationAlertRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public MicrosoftSecurityIncidentCreationAlertRule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MicrosoftSecurityIncidentCreationAlertRule(String name) {
        this(name, MicrosoftSecurityIncidentCreationAlertRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MicrosoftSecurityIncidentCreationAlertRule(String name, MicrosoftSecurityIncidentCreationAlertRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MicrosoftSecurityIncidentCreationAlertRule(String name, MicrosoftSecurityIncidentCreationAlertRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:MicrosoftSecurityIncidentCreationAlertRule", name, makeArgs(args), makeResourceOptions(options, Output.empty()));
    }

    private MicrosoftSecurityIncidentCreationAlertRule(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:MicrosoftSecurityIncidentCreationAlertRule", name, null, makeResourceOptions(options, id));
    }

    private static MicrosoftSecurityIncidentCreationAlertRuleArgs makeArgs(MicrosoftSecurityIncidentCreationAlertRuleArgs args) {
        var builder = args == null ? MicrosoftSecurityIncidentCreationAlertRuleArgs.builder() : MicrosoftSecurityIncidentCreationAlertRuleArgs.builder(args);
        return builder
            .kind("MicrosoftSecurityIncidentCreation")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:securityinsights/v20190101preview:MicrosoftSecurityIncidentCreationAlertRule").build()),
                Output.of(Alias.builder().setType("azure-native:securityinsights/v20200101:MicrosoftSecurityIncidentCreationAlertRule").build()),
                Output.of(Alias.builder().setType("azure-native:securityinsights/v20210301preview:MicrosoftSecurityIncidentCreationAlertRule").build()),
                Output.of(Alias.builder().setType("azure-native:securityinsights/v20210901preview:MicrosoftSecurityIncidentCreationAlertRule").build())
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
    public static MicrosoftSecurityIncidentCreationAlertRule get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MicrosoftSecurityIncidentCreationAlertRule(name, id, options);
    }
}
