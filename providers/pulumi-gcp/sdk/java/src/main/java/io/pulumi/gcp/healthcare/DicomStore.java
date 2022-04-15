// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.healthcare.DicomStoreArgs;
import io.pulumi.gcp.healthcare.inputs.DicomStoreState;
import io.pulumi.gcp.healthcare.outputs.DicomStoreNotificationConfig;
import io.pulumi.gcp.healthcare.outputs.DicomStoreStreamConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A DicomStore is a datastore inside a Healthcare dataset that conforms to the DICOM
 * (https://www.dicomstandard.org/about/) standard for Healthcare information exchange
 * 
 * To get more information about DicomStore, see:
 * 
 * * [API documentation](https://cloud.google.com/healthcare/docs/reference/rest/v1/projects.locations.datasets.dicomStores)
 * * How-to Guides
 *     * [Creating a DICOM store](https://cloud.google.com/healthcare/docs/how-tos/dicom)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DicomStore can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/dicomStore:DicomStore default {{dataset}}/dicomStores/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/dicomStore:DicomStore default {{dataset}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:healthcare/dicomStore:DicomStore")
public class DicomStore extends io.pulumi.resources.CustomResource {
    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * 
     */
    @Export(name="dataset", type=String.class, parameters={})
    private Output<String> dataset;

    /**
     * @return Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * 
     */
    public Output<String> dataset() {
        return this.dataset;
    }
    /**
     * User-supplied key-value pairs used to organize DICOM stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return User-supplied key-value pairs used to organize DICOM stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The resource name for the DicomStore.
     * ** Changing this property may recreate the Dicom store (removing all data) **
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the DicomStore.
     * ** Changing this property may recreate the Dicom store (removing all data) **
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Export(name="notificationConfig", type=DicomStoreNotificationConfig.class, parameters={})
    private Output</* @Nullable */ DicomStoreNotificationConfig> notificationConfig;

    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ DicomStoreNotificationConfig> notificationConfig() {
        return this.notificationConfig;
    }
    /**
     * The fully qualified name of this dataset
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The fully qualified name of this dataset
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
     * streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
     * Structure is documented below.
     * 
     */
    @Export(name="streamConfigs", type=List.class, parameters={DicomStoreStreamConfig.class})
    private Output</* @Nullable */ List<DicomStoreStreamConfig>> streamConfigs;

    /**
     * @return To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
     * streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<DicomStoreStreamConfig>> streamConfigs() {
        return this.streamConfigs;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DicomStore(String name) {
        this(name, DicomStoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DicomStore(String name, DicomStoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DicomStore(String name, DicomStoreArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/dicomStore:DicomStore", name, args == null ? DicomStoreArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DicomStore(String name, Output<String> id, @Nullable DicomStoreState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/dicomStore:DicomStore", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static DicomStore get(String name, Output<String> id, @Nullable DicomStoreState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DicomStore(name, id, state, options);
    }
}
