// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.kms.KeyRingImportJobArgs;
import io.pulumi.gcp.kms.inputs.KeyRingImportJobState;
import io.pulumi.gcp.kms.outputs.KeyRingImportJobAttestation;
import io.pulumi.gcp.kms.outputs.KeyRingImportJobPublicKey;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A `KeyRingImportJob` can be used to create `CryptoKeys` and `CryptoKeyVersions` using pre-existing
 * key material, generated outside of Cloud KMS. A `KeyRingImportJob` expires 3 days after it is created.
 * Once expired, Cloud KMS will no longer be able to import or unwrap any key material that
 * was wrapped with the `KeyRingImportJob`'s public key.
 * 
 * > **Note:** KeyRingImportJobs cannot be deleted from Google Cloud Platform.
 * Destroying a provider-managed KeyRingImportJob will remove it from state but
 * *will not delete the resource from the project.*
 * 
 * To get more information about KeyRingImportJob, see:
 * 
 * * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.importJobs)
 * * How-to Guides
 *     * [Importing a key](https://cloud.google.com/kms/docs/importing-a-key)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * KeyRingImportJob can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:kms/keyRingImportJob:KeyRingImportJob default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:kms/keyRingImportJob:KeyRingImportJob")
public class KeyRingImportJob extends io.pulumi.resources.CustomResource {
    /**
     * Statement that was generated and signed by the key creator (for example, an HSM) at key creation time. Use this
     * statement to verify attributes of the key as stored on the HSM, independently of Google. Only present if the chosen
     * ImportMethod is one with a protection level of HSM.
     * 
     */
    @Export(name="attestations", type=List.class, parameters={KeyRingImportJobAttestation.class})
    private Output<List<KeyRingImportJobAttestation>> attestations;

    /**
     * @return Statement that was generated and signed by the key creator (for example, an HSM) at key creation time. Use this
     * statement to verify attributes of the key as stored on the HSM, independently of Google. Only present if the chosen
     * ImportMethod is one with a protection level of HSM.
     * 
     */
    public Output<List<KeyRingImportJobAttestation>> getAttestations() {
        return this.attestations;
    }
    /**
     * The time at which this resource is scheduled for expiration and can no longer be used. This is in RFC3339 text format.
     * 
     */
    @Export(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return The time at which this resource is scheduled for expiration and can no longer be used. This is in RFC3339 text format.
     * 
     */
    public Output<String> getExpireTime() {
        return this.expireTime;
    }
    /**
     * It must be unique within a KeyRing and match the regular expression [a-zA-Z0-9_-]{1,63}
     * 
     */
    @Export(name="importJobId", type=String.class, parameters={})
    private Output<String> importJobId;

    /**
     * @return It must be unique within a KeyRing and match the regular expression [a-zA-Z0-9_-]{1,63}
     * 
     */
    public Output<String> getImportJobId() {
        return this.importJobId;
    }
    /**
     * The wrapping method to be used for incoming key material.
     * Possible values are `RSA_OAEP_3072_SHA1_AES_256` and `RSA_OAEP_4096_SHA1_AES_256`.
     * 
     */
    @Export(name="importMethod", type=String.class, parameters={})
    private Output<String> importMethod;

    /**
     * @return The wrapping method to be used for incoming key material.
     * Possible values are `RSA_OAEP_3072_SHA1_AES_256` and `RSA_OAEP_4096_SHA1_AES_256`.
     * 
     */
    public Output<String> getImportMethod() {
        return this.importMethod;
    }
    /**
     * The KeyRing that this import job belongs to.
     * Format: `'projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}'`.
     * 
     */
    @Export(name="keyRing", type=String.class, parameters={})
    private Output<String> keyRing;

    /**
     * @return The KeyRing that this import job belongs to.
     * Format: `'projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}'`.
     * 
     */
    public Output<String> getKeyRing() {
        return this.keyRing;
    }
    /**
     * The resource name for this ImportJob in the format projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}importJobs/*.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for this ImportJob in the format projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}importJobs/*.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The protection level of the ImportJob. This must match the protectionLevel of the
     * versionTemplate on the CryptoKey you attempt to import into.
     * Possible values are `SOFTWARE`, `HSM`, and `EXTERNAL`.
     * 
     */
    @Export(name="protectionLevel", type=String.class, parameters={})
    private Output<String> protectionLevel;

    /**
     * @return The protection level of the ImportJob. This must match the protectionLevel of the
     * versionTemplate on the CryptoKey you attempt to import into.
     * Possible values are `SOFTWARE`, `HSM`, and `EXTERNAL`.
     * 
     */
    public Output<String> getProtectionLevel() {
        return this.protectionLevel;
    }
    /**
     * The public key with which to wrap key material prior to import. Only returned if state is 'ACTIVE'.
     * 
     */
    @Export(name="publicKeys", type=List.class, parameters={KeyRingImportJobPublicKey.class})
    private Output<List<KeyRingImportJobPublicKey>> publicKeys;

    /**
     * @return The public key with which to wrap key material prior to import. Only returned if state is 'ACTIVE'.
     * 
     */
    public Output<List<KeyRingImportJobPublicKey>> getPublicKeys() {
        return this.publicKeys;
    }
    /**
     * The current state of the ImportJob, indicating if it can be used.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the ImportJob, indicating if it can be used.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    public interface BuilderApplicator {
        public void apply(KeyRingImportJobArgs.Builder a);
    }
    private static io.pulumi.gcp.kms.KeyRingImportJobArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.kms.KeyRingImportJobArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public KeyRingImportJob(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KeyRingImportJob(String name) {
        this(name, KeyRingImportJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KeyRingImportJob(String name, KeyRingImportJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KeyRingImportJob(String name, KeyRingImportJobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/keyRingImportJob:KeyRingImportJob", name, args == null ? KeyRingImportJobArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private KeyRingImportJob(String name, Output<String> id, @Nullable KeyRingImportJobState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/keyRingImportJob:KeyRingImportJob", name, state, makeResourceOptions(options, id));
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
    public static KeyRingImportJob get(String name, Output<String> id, @Nullable KeyRingImportJobState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KeyRingImportJob(name, id, state, options);
    }
}
