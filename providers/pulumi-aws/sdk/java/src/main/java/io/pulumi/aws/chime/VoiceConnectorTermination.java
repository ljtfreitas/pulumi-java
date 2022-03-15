// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.chime.VoiceConnectorTerminationArgs;
import io.pulumi.aws.chime.inputs.VoiceConnectorTerminationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Enable Termination settings to control outbound calling from your SIP infrastructure.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Chime Voice Connector Termination can be imported using the `voice_connector_id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:chime/voiceConnectorTermination:VoiceConnectorTermination default abcdef1ghij2klmno3pqr4
 * ```
 * 
 */
@ResourceType(type="aws:chime/voiceConnectorTermination:VoiceConnectorTermination")
public class VoiceConnectorTermination extends io.pulumi.resources.CustomResource {
    /**
     * The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
     * 
     */
    @Export(name="callingRegions", type=List.class, parameters={String.class})
    private Output<List<String>> callingRegions;

    /**
     * @return The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
     * 
     */
    public Output<List<String>> getCallingRegions() {
        return this.callingRegions;
    }
    /**
     * The IP addresses allowed to make calls, in CIDR format.
     * 
     */
    @Export(name="cidrAllowLists", type=List.class, parameters={String.class})
    private Output<List<String>> cidrAllowLists;

    /**
     * @return The IP addresses allowed to make calls, in CIDR format.
     * 
     */
    public Output<List<String>> getCidrAllowLists() {
        return this.cidrAllowLists;
    }
    /**
     * The limit on calls per second. Max value based on account service quota. Default value of `1`.
     * 
     */
    @Export(name="cpsLimit", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> cpsLimit;

    /**
     * @return The limit on calls per second. Max value based on account service quota. Default value of `1`.
     * 
     */
    public Output</* @Nullable */ Integer> getCpsLimit() {
        return this.cpsLimit;
    }
    /**
     * The default caller ID phone number.
     * 
     */
    @Export(name="defaultPhoneNumber", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultPhoneNumber;

    /**
     * @return The default caller ID phone number.
     * 
     */
    public Output</* @Nullable */ String> getDefaultPhoneNumber() {
        return this.defaultPhoneNumber;
    }
    /**
     * When termination settings are disabled, outbound calls can not be made.
     * 
     */
    @Export(name="disabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return When termination settings are disabled, outbound calls can not be made.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * The Amazon Chime Voice Connector ID.
     * 
     */
    @Export(name="voiceConnectorId", type=String.class, parameters={})
    private Output<String> voiceConnectorId;

    /**
     * @return The Amazon Chime Voice Connector ID.
     * 
     */
    public Output<String> getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    public interface BuilderApplicator {
        public void apply(VoiceConnectorTerminationArgs.Builder a);
    }
    private static io.pulumi.aws.chime.VoiceConnectorTerminationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.chime.VoiceConnectorTerminationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VoiceConnectorTermination(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VoiceConnectorTermination(String name) {
        this(name, VoiceConnectorTerminationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VoiceConnectorTermination(String name, VoiceConnectorTerminationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VoiceConnectorTermination(String name, VoiceConnectorTerminationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:chime/voiceConnectorTermination:VoiceConnectorTermination", name, args == null ? VoiceConnectorTerminationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VoiceConnectorTermination(String name, Output<String> id, @Nullable VoiceConnectorTerminationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:chime/voiceConnectorTermination:VoiceConnectorTermination", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VoiceConnectorTermination get(String name, Output<String> id, @Nullable VoiceConnectorTerminationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VoiceConnectorTermination(name, id, state, options);
    }
}
