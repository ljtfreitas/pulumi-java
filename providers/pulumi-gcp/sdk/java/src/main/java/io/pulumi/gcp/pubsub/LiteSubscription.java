// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.pubsub.LiteSubscriptionArgs;
import io.pulumi.gcp.pubsub.inputs.LiteSubscriptionState;
import io.pulumi.gcp.pubsub.outputs.LiteSubscriptionDeliveryConfig;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:pubsub/liteSubscription:LiteSubscription")
public class LiteSubscription extends io.pulumi.resources.CustomResource {
    @OutputExport(name="deliveryConfig", type=LiteSubscriptionDeliveryConfig.class, parameters={})
    private Output</* @Nullable */ LiteSubscriptionDeliveryConfig> deliveryConfig;

    public Output</* @Nullable */ LiteSubscriptionDeliveryConfig> getDeliveryConfig() {
        return this.deliveryConfig;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    public Output</* @Nullable */ String> getRegion() {
        return this.region;
    }
    @OutputExport(name="topic", type=String.class, parameters={})
    private Output<String> topic;

    public Output<String> getTopic() {
        return this.topic;
    }
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output</* @Nullable */ String> zone;

    public Output</* @Nullable */ String> getZone() {
        return this.zone;
    }

    public LiteSubscription(String name, LiteSubscriptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/liteSubscription:LiteSubscription", name, args == null ? LiteSubscriptionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LiteSubscription(String name, Input<String> id, @Nullable LiteSubscriptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/liteSubscription:LiteSubscription", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static LiteSubscription get(String name, Input<String> id, @Nullable LiteSubscriptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LiteSubscription(name, id, state, options);
    }
}