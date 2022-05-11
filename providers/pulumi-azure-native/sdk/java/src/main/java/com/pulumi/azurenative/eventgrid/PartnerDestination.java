// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.eventgrid.PartnerDestinationArgs;
import com.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Event Grid Partner Destination.
 * API Version: 2021-10-15-preview.
 * 
 * ## Example Usage
 * ### PartnerDestinations_CreateOrUpdate
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var partnerDestination = new PartnerDestination(&#34;partnerDestination&#34;, PartnerDestinationArgs.builder()        
 *             .endpointBaseUrl(&#34;https://www.example/endpoint&#34;)
 *             .endpointServiceContext(&#34;This is an example&#34;)
 *             .expirationTimeIfNotActivatedUtc(&#34;2022-03-14T19:33:43.430Z&#34;)
 *             .location(&#34;westus2&#34;)
 *             .messageForActivation(&#34;Sample Activation message&#34;)
 *             .partnerDestinationName(&#34;examplePartnerDestinationName1&#34;)
 *             .partnerRegistrationImmutableId(&#34;0bd70ee2-7d95-447e-ab1f-c4f320019404&#34;)
 *             .resourceGroupName(&#34;examplerg&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventgrid:PartnerDestination examplePartnerDestinationName1 /subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventGrid/partnerDestinations/examplePartnerDestinationName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventgrid:PartnerDestination")
public class PartnerDestination extends com.pulumi.resources.CustomResource {
    /**
     * Activation state of the partner destination.
     * 
     */
    @Export(name="activationState", type=String.class, parameters={})
    private Output</* @Nullable */ String> activationState;

    /**
     * @return Activation state of the partner destination.
     * 
     */
    public Output<Optional<String>> activationState() {
        return Codegen.optional(this.activationState);
    }
    /**
     * Endpoint Base URL of the partner destination
     * 
     */
    @Export(name="endpointBaseUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> endpointBaseUrl;

    /**
     * @return Endpoint Base URL of the partner destination
     * 
     */
    public Output<Optional<String>> endpointBaseUrl() {
        return Codegen.optional(this.endpointBaseUrl);
    }
    /**
     * Endpoint context associated with this partner destination.
     * 
     */
    @Export(name="endpointServiceContext", type=String.class, parameters={})
    private Output</* @Nullable */ String> endpointServiceContext;

    /**
     * @return Endpoint context associated with this partner destination.
     * 
     */
    public Output<Optional<String>> endpointServiceContext() {
        return Codegen.optional(this.endpointServiceContext);
    }
    /**
     * Expiration time of the partner destination. If this timer expires and the partner destination was never activated,
     * the partner destination and corresponding channel are deleted.
     * 
     */
    @Export(name="expirationTimeIfNotActivatedUtc", type=String.class, parameters={})
    private Output</* @Nullable */ String> expirationTimeIfNotActivatedUtc;

    /**
     * @return Expiration time of the partner destination. If this timer expires and the partner destination was never activated,
     * the partner destination and corresponding channel are deleted.
     * 
     */
    public Output<Optional<String>> expirationTimeIfNotActivatedUtc() {
        return Codegen.optional(this.expirationTimeIfNotActivatedUtc);
    }
    /**
     * Location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the resource.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Context or helpful message that can be used during the approval process.
     * 
     */
    @Export(name="messageForActivation", type=String.class, parameters={})
    private Output</* @Nullable */ String> messageForActivation;

    /**
     * @return Context or helpful message that can be used during the approval process.
     * 
     */
    public Output<Optional<String>> messageForActivation() {
        return Codegen.optional(this.messageForActivation);
    }
    /**
     * Name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The immutable Id of the corresponding partner registration.
     * 
     */
    @Export(name="partnerRegistrationImmutableId", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerRegistrationImmutableId;

    /**
     * @return The immutable Id of the corresponding partner registration.
     * 
     */
    public Output<Optional<String>> partnerRegistrationImmutableId() {
        return Codegen.optional(this.partnerRegistrationImmutableId);
    }
    /**
     * Provisioning state of the partner destination.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Provisioning state of the partner destination.
     * 
     */
    public Output<Optional<String>> provisioningState() {
        return Codegen.optional(this.provisioningState);
    }
    /**
     * The system metadata relating to Partner Destination resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to Partner Destination resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Tags of the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags of the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PartnerDestination(String name) {
        this(name, PartnerDestinationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PartnerDestination(String name, PartnerDestinationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PartnerDestination(String name, PartnerDestinationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:PartnerDestination", name, args == null ? PartnerDestinationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PartnerDestination(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:PartnerDestination", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:eventgrid/v20211015preview:PartnerDestination").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PartnerDestination get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PartnerDestination(name, id, options);
    }
}
