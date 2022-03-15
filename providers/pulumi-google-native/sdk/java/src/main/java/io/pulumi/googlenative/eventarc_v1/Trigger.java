// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.eventarc_v1.TriggerArgs;
import io.pulumi.googlenative.eventarc_v1.outputs.DestinationResponse;
import io.pulumi.googlenative.eventarc_v1.outputs.EventFilterResponse;
import io.pulumi.googlenative.eventarc_v1.outputs.TransportResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Create a new trigger in a particular project and location.
 * 
 */
@ResourceType(type="google-native:eventarc/v1:Trigger")
public class Trigger extends io.pulumi.resources.CustomResource {
    /**
     * The creation time.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Destination specifies where the events should be sent to.
     * 
     */
    @Export(name="destination", type=DestinationResponse.class, parameters={})
    private Output<DestinationResponse> destination;

    /**
     * @return Destination specifies where the events should be sent to.
     * 
     */
    public Output<DestinationResponse> getDestination() {
        return this.destination;
    }
    /**
     * This checksum is computed by the server based on the value of other fields, and might be sent only on create requests to ensure that the client has an up-to-date value before proceeding.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return This checksum is computed by the server based on the value of other fields, and might be sent only on create requests to ensure that the client has an up-to-date value before proceeding.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * null The list of filters that applies to event attributes. Only events that match all the provided filters are sent to the destination.
     * 
     */
    @Export(name="eventFilters", type=List.class, parameters={EventFilterResponse.class})
    private Output<List<EventFilterResponse>> eventFilters;

    /**
     * @return null The list of filters that applies to event attributes. Only events that match all the provided filters are sent to the destination.
     * 
     */
    public Output<List<EventFilterResponse>> getEventFilters() {
        return this.eventFilters;
    }
    /**
     * Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the trigger. Must be unique within the location of the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the trigger. Must be unique within the location of the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have the `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. To create Audit Log triggers, the service account should also have the `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    @Export(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have the `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. To create Audit Log triggers, the service account should also have the `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    public Output<String> getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Optional. To deliver messages, Eventarc might use other GCP products as a transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    @Export(name="transport", type=TransportResponse.class, parameters={})
    private Output<TransportResponse> transport;

    /**
     * @return Optional. To deliver messages, Eventarc might use other GCP products as a transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    public Output<TransportResponse> getTransport() {
        return this.transport;
    }
    /**
     * Server-assigned unique identifier for the trigger. The value is a UUID4 string and guaranteed to remain unchanged until the resource is deleted.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return Server-assigned unique identifier for the trigger. The value is a UUID4 string and guaranteed to remain unchanged until the resource is deleted.
     * 
     */
    public Output<String> getUid() {
        return this.uid;
    }
    /**
     * The last-modified time.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last-modified time.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(TriggerArgs.Builder a);
    }
    private static io.pulumi.googlenative.eventarc_v1.TriggerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.eventarc_v1.TriggerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Trigger(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Trigger(String name) {
        this(name, TriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Trigger(String name, TriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Trigger(String name, TriggerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:eventarc/v1:Trigger", name, args == null ? TriggerArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Trigger(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:eventarc/v1:Trigger", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Trigger get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Trigger(name, id, options);
    }
}
