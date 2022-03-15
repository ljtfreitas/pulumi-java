// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.IncidentCommentArgs;
import io.pulumi.azurenative.securityinsights.outputs.ClientInfoResponse;
import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents an incident comment
 * API Version: 2021-03-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:IncidentComment 4bb36b7b-26ff-4d1c-9cbe-0d8ab3da0014 /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalIinsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/incidents/73e01a99-5cd7-4139-a149-9f2736ff2ab5/comments/4bb36b7b-26ff-4d1c-9cbe-0d8ab3da0014 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:IncidentComment")
public class IncidentComment extends io.pulumi.resources.CustomResource {
    /**
     * Describes the client that created the comment
     * 
     */
    @Export(name="author", type=ClientInfoResponse.class, parameters={})
    private Output<ClientInfoResponse> author;

    /**
     * @return Describes the client that created the comment
     * 
     */
    public Output<ClientInfoResponse> getAuthor() {
        return this.author;
    }
    /**
     * The time the comment was created
     * 
     */
    @Export(name="createdTimeUtc", type=String.class, parameters={})
    private Output<String> createdTimeUtc;

    /**
     * @return The time the comment was created
     * 
     */
    public Output<String> getCreatedTimeUtc() {
        return this.createdTimeUtc;
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
     * The time the comment was updated
     * 
     */
    @Export(name="lastModifiedTimeUtc", type=String.class, parameters={})
    private Output<String> lastModifiedTimeUtc;

    /**
     * @return The time the comment was updated
     * 
     */
    public Output<String> getLastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }
    /**
     * The comment message
     * 
     */
    @Export(name="message", type=String.class, parameters={})
    private Output<String> message;

    /**
     * @return The comment message
     * 
     */
    public Output<String> getMessage() {
        return this.message;
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
        public void apply(IncidentCommentArgs.Builder a);
    }
    private static io.pulumi.azurenative.securityinsights.IncidentCommentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.securityinsights.IncidentCommentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IncidentComment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IncidentComment(String name) {
        this(name, IncidentCommentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IncidentComment(String name, IncidentCommentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IncidentComment(String name, IncidentCommentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:IncidentComment", name, args == null ? IncidentCommentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private IncidentComment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:IncidentComment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:securityinsights/v20190101preview:IncidentComment").build()),
                Output.of(Alias.builder().setType("azure-native:securityinsights/v20210301preview:IncidentComment").build()),
                Output.of(Alias.builder().setType("azure-native:securityinsights/v20210401:IncidentComment").build()),
                Output.of(Alias.builder().setType("azure-native:securityinsights/v20210901preview:IncidentComment").build())
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
    public static IncidentComment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IncidentComment(name, id, options);
    }
}
